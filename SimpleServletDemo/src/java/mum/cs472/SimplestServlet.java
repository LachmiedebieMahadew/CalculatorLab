/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.cs472;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kadjal
 */
public class SimplestServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
  protected void doGet(HttpServletRequest request,
 HttpServletResponse response)throws ServletException, IOException
 {
 PrintWriter out = response.getWriter();
 out.print("<html><head><title>Test</title></head><body>");
 out.print("<form method='post'>");
 out.print("<p>Please click the button</p>");
 out.print("<input type='submit' value='Click me'/>");
 out.print("</form>");
 out.print("</body></html>");
 }

 protected void doPost(HttpServletRequest request,
 HttpServletResponse response) throws ServletException, IOException
 {
 PrintWriter out = response.getWriter();
 out.print("<html><head><title>Test</title></head><body>");
 out.print("<p>Postback received</p>");
 out.print("</body></html>");
 }

   
 
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
