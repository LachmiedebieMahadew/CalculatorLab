/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beer;

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
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class BeerSelect extends HttpServlet {
 
public void doPost(HttpServletRequest request,
 HttpServletResponse response)
 throws IOException, ServletException {

  
 response.setContentType("text/html");
 PrintWriter out = response.getWriter();
 out.println("Beer Selection Advice<br>");
 String c = request.getParameter("color");
 BeerExpert b= new BeerExpert();
 List<String> result=b.getBrands(c);
 Iterator it= result.iterator();
  while(it.hasNext()){
      out.println("<br> Try  " + it.next());
  }
 
 }


public void doGet(HttpServletRequest request,
 HttpServletResponse response)
 throws IOException, ServletException {

  request.getRequestDispatcher("result.jsp").forward(request,response);
 }

}
