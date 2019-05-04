/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package answer;

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
public class CaculateServlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CaculateServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CaculateServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        PrintWriter out= response.getWriter();
                   response.setContentType("text/html");
      try{ 
        if(!(request.getParameter("a1").isEmpty()) &&!(request.getParameter("a2").isEmpty()) ){   
           double firstNum=Double.parseDouble(request.getParameter("a1"));
           double secondNum=Double.parseDouble(request.getParameter("a2"));
           double answer=firstNum+secondNum;
           out.println(firstNum +" + "+secondNum+" = "+ answer);
         }
        if(!(request.getParameter("m1").isEmpty()) &&!(request.getParameter("m2").isEmpty()) ){   
         double f1=Double.parseDouble(request.getParameter("m1"));
         double f2=Double.parseDouble(request.getParameter("m2"));
         double answer=f1*f2;
         out.println("<br>");
         out.println(f1 +" + "+f2+" = "+ answer);
        }
      }
        catch(NumberFormatException e){
            System.err.println("Invalid input!, Please type in number only"); }
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
