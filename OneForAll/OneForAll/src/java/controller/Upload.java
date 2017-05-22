package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.Paths;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.lang.NullPointerException;
import model.Files;
import model.Tag;
import model.Tagss;


@MultipartConfig // <---- ใส่เพื่อบอก ว่าจะใช้ ความสามารถของ servlet 3.0 ในการดึงข้อมูลจากไฟล์ที่อัพโหลด
public class Upload extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        Object id = request.getSession().getAttribute("userId");
        Part filePart = request.getPart("file"); // เอาข้อมูลมาจาก form ที่มี input ชื่อ file โดยเป็น input type = file
        
        
        String detail = request.getParameter("detail"); // เรียกข้อมูลจากช่อง description มาผ่านตัวแปรชื่อ detail
        String title = request.getParameter("title");
        String tagname =request.getParameter("tagname");
        
        String fileNameType = Paths.get(filePart.getSubmittedFileName()).getFileName().toString(); // เอาชื่อไฟล์ออกมา จะมีนามสกุลติดมาด้วย ถ้าจะเอา แค่นามสกุลแล้วใช้ชื่อไฟล์ที่เจน เอง ก็ให้ใช้ substring
       
        InputStream fileContent = filePart.getInputStream(); // เอาข้อมูลตัวไฟล์(ที่เป้น byte)ออกมาเก็บใน inputstream เพื่อรอการเขียนไฟล์
        OutputStream outputStream = null;
        String tranPath;
        
        tranPath = "C:\\Users\\User\\Documents\\kademy_one4all\\OneForAll\\";
        int capacity=0;
        try {
            int ids = Integer.parseInt(id.toString());
           /* outputStream // สร้าง outputStream ในการเขียนไฟล์ 
                    = new FileOutputStream(new File(tranPath+title));
            */
           /*
            int read = 0;
            byte[] bytes = new byte[1024]; // สร้าง byte ในการทีจะบอกว่าจะให้เขียนไฟล์ ทีละ กี่ byte
            capacity = fileContent.available()/10000; //ใช้class available เพื่ออ่านตรวจความจุfile ต้องไว้ก่อน readfile!!!(/1000 เพื่อให้เก็บเป็น kb doubleเก็บไม่พอ)
            
            while ((read = fileContent.read(bytes)) != -1) {  // เป็นการสั่งให้เขียนไฟล์ ทีละ 1024 byte ถ้าเขียนหมดแล้ว จะ return -1
                outputStream.write(bytes, 0, read);// เขียนไฟล์ ตามจำนวน byte ที่ read มาได้ โดยให้เริ่มตั้งแต่ byte ที่ 0
            }

           */
           // Part list (multi files).
            for (Part part : request.getParts()) {
                String fileName = Files.extractFileName(part);
                if (fileName != null && fileName.length() > 0) {
                    // File data
                    InputStream is = part.getInputStream();
                    // Write to file
                    Files.insertFile(title,detail,is,capacity,fileName,tagname,ids);//เพิ่ม tagname ไว้เพื่อเอาไปหา tagId เพื่อดึงเข้า file_tag
                    Tagss.insertTag(tagname); 
                }
            }
            
        } catch (FileNotFoundException e) {
            request.setAttribute("msg", "Not Found file");
        } finally {  // ปิด outputStream เมื่อ เขียนเสร็จเพื่อประหยัด resource
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
     
        String storePath=tranPath+title; //เก็บpath
       //tagid รันให้เอง insert tagname ก่อน insert file เพื่อที่จะส่งไป file_tag ได้ (เพื่อไม่ให้ tagId เป็น0)
       
        getServletContext().getRequestDispatcher("/HomeServlet").forward(request, response);
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
