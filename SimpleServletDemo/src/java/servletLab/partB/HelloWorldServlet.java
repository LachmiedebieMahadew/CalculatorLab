/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletLab.partB;

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
public class HelloWorldServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */


    
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
         PrintWriter out = response.getWriter();
                     out.print("<html><head><title>HelloWorld</title></head><body>"); 
                     out.print("<h1> Hello World</h1>");
                     out.print("</body></html>");
 }
    
    @ Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
     throws ServletException,IOException{
        PrintWriter out= response.getWriter();
                     String name=request.getParameter("name");
                    out.print("<html><head><title>Welcome</title></head> </html>");
                    out.print("Welcome"+name);
    }
    }

   


