package contoller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.File;

import model.Tag;

@WebServlet(name = "FileServlet", urlPatterns = {"/FileServlet"})
public class FileServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String name = request.getParameter("filename"); //สตริงเพราะจาวาแสดงค่าออกเป็นสตริง

        List<File> f = File.findByName(name);
        List<Tag> ft = Tag.findByTag(name);
        
        
        List<Tag> tt = Tag.listTags();
        request.setAttribute("tt", tt);
        List<File> lf = File.listFileByTime();
        for (int i = 0; i < lf.size()-1; i++) {     
            List<Tag> tagNames = Tag.showTag(lf.get(i).getFileName());
            request.setAttribute("lf", lf);
            request.setAttribute("tagNames", tagNames);
        }
       // request.setAttribute("lf", lf);
        
        if (f == null) {
            System.out.println("eiei");
            if (ft == null) {
                request.setAttribute("msg", "Not Found File or Tag : " + name);
                System.out.println("kiki");
            } else {
                List<Tag> t = Tag.showTag(name);
                request.setAttribute("t", t);
                request.setAttribute("ft", ft);
                System.out.println("grigri");
            }

        } else {
            request.setAttribute("f", f);

            List<Tag> t = Tag.showTag(name);

            request.setAttribute("t", t);
            System.out.println(name);
        }
        getServletContext().getRequestDispatcher("/home.jsp").forward(request, response); //เชื่อมหน้าที่แสดงผล

        /* if (name.equals("")) {
            request.setAttribute("msg", "Not Found File : " + name);
        } else {
            request.setAttribute("f", f);
            char c = name.charAt(0);
            if (c == '#') {
                List<Tag> t = Tag.findByTag(name);
                System.out.println("sdfsdfdfdsfdsfd");
                if (t == null) {
                    request.setAttribute("msg", "Not Found Tag : " + name + "555");
                } else {
                    request.setAttribute("t", t);
                    System.out.println("fdsfdsfdsfdsfdsfdsdsfdfdsfdsf");
                }

            }
        }*/
        
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
