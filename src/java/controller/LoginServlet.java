/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.ReportFile;
import model.Users;

/**
 *
 * @author KARTOON
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

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
        String userN = request.getParameter("Username");
        String passW = request.getParameter("Password");
        Users us = new Users();
        try {
            long usn = Long.parseLong(userN);
            boolean login = us.logIn(usn, passW);
            if (login == true) {
                int type = us.checkType(userN).getType();
                if (type == 0) {
                    HttpSession session = request.getSession();
                    session.setAttribute("username", usn);
                    getServletContext().getRequestDispatcher("/Kademy.jsp").forward(request, response);
                } else {
                    HttpSession session = request.getSession();
                    session.setAttribute("username", usn);
                    List<ReportFile> rpf = ReportFile.listReportFile();
                    request.setAttribute("report", rpf);
                    getServletContext().getRequestDispatcher("/Admin.jsp").forward(request, response);
                }
            } else {
                request.setAttribute("msg",Users.getMsg());
                getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);
            }
            
        } catch (NumberFormatException e) {
            request.setAttribute("msg","Please fill username with number");
            getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);
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
