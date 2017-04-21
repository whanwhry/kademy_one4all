
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


@MultipartConfig
public class Upload extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        Part filePart = request.getPart("file");
        String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString();
        InputStream fileContent=filePart.getInputStream();
        OutputStream outputStream = null;
        
        try{ 
            outputStream
                    =new FileOutputStream(new File("C:\\Users\\User\\Documents\\kademy_one4all\\OneForAll"+fileName));
            int read=0;
            byte[] bytes=new byte[1024];
        
            while ((read = fileContent.read(bytes)) != -1){
                outputStream.write(bytes, 0, read);
        }
        
        }catch(FileNotFoundException e){
            System.out.println(e);
        } finally { // ปิด outputStream เมื่อ เขียนเสร็จเพื่อประหยัด resource
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
        getServletContext().getRequestDispatcher("/success.jsp").forward(request, response);
        
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
