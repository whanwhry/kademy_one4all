/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
public class HomeServlet extends HttpServlet {

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
        try{
            //int count = 0 ;
          //  ArrayList<String> tageiei = new ArrayList<>();
          //  String tag  ;
          //  int indexCount = 0 ;
          List<Tag> listTag = Tag.listTags();
            request.setAttribute("listTag", listTag);
            int ids = Integer.parseInt(id.toString());
            List<Files> rub = Files.setTagList(ids);
            request.setAttribute("searchAll", rub);
//            for(Files i : rub){
//                do{
//                tag = i.getTagName().substring(indexCount,i.getTagName().indexOf(","));
//                indexCount = i.getTagName().indexOf(",");
//                tageiei.add(tag);
//                }while(indexCount!=i.getTagName().length()-1);
//            }
           //  request.setAttribute("tageiei", tageiei);
            
            getServletContext().getRequestDispatcher("/home.jsp").forward(request, response);
        }catch(NumberFormatException e){
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
