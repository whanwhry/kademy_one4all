/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Files;
import model.Tag;

/**
 *
 * @author KARTOON
 */
public class FileHomeServlet extends HttpServlet {

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
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        Object id = request.getSession().getAttribute("userId");
        String name = request.getParameter("filename"); //สตริงเพราะจาวาแสดงค่าออกเป็นสตริง

        try {
            int ids = Integer.parseInt(id.toString());
            List<Files> nameSearch = Files.findByName(name);
            List<Tag> nameTag = Tag.findByTag(name);

           
            List<Files> searchAll = Files.listFileByTime(ids);

            if (nameSearch == null) {
                System.out.println("eiei");
                if (nameTag == null) {
                    request.setAttribute("msg", "Not Found File or Tag : " + name);
                    System.out.println("kiki");
                } else {
                    List<Tag> tagMatch = Tag.showTag(name);
                    request.setAttribute("tagMatch", tagMatch);
                    request.setAttribute("nameTag", nameTag);
                    System.out.println("grigri");
                }

            } else {
                request.setAttribute("nameSearch", nameSearch);

                List<Tag> showTagMatch = Tag.showTag(name);

                request.setAttribute("showTagMatch", showTagMatch);
                System.out.println(name);
            }
            request.setAttribute("name", name);
            getServletContext().getRequestDispatcher("/home.jsp").forward(request, response); //เชื่อมหน้าที่แสดงผล
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
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
