/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Blob;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ReportFile;

/**
 *
 * @author KARTOON
 */
public class DownloadServlet extends HttpServlet {

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
        try {
            int id = Integer.parseInt(request.getParameter("id"));

            ReportFile download = ReportFile.downloadReportFile(id);

            if (download == null) {
                // No record found.
                response.getWriter().write("File not found");
                return;
            }
            // file1.zip, file2.zip
            String fileName = download.getPath();
            System.out.println("File Name: " + fileName);

            // abc.txt => text/plain
            // abc.zip => application/zip
            // abc.pdf => application/pdf
            String contentType = getServletContext().getMimeType(fileName);
            System.out.println("Content Type: " + contentType);

            response.setHeader("Content-Type", contentType);

            response.setHeader("Content-Length", String.valueOf(download.getFileBlob().length()));

            response.setHeader("Content-Disposition", "inline; filename=\"" + download.getPath()+ "\"");

            // For big BLOB data.
            Blob fileData = download.getFileBlob();
            InputStream ipst = fileData.getBinaryStream();

            byte[] bytes = new byte[1024];
            int bytesRead;

            while ((bytesRead = ipst.read(bytes)) != -1) {
                // Write image data to Response.
                response.getOutputStream().write(bytes, 0, bytesRead);
            }
            ipst.close();

        } catch (Exception e) {
            throw new ServletException(e);
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
