/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Kadjal
 */
public class QuizServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        HttpSession session = request.getSession();
        Quiz quiz = (Quiz) session.getAttribute("quiz");
        
        
       if(quiz == null){
           quiz= new Quiz();
       session.setAttribute("quiz",quiz);
       }
       request.getRequestDispatcher("Number.jsp").forward(request,response);
       
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session= request.getSession();
        Quiz quiz= (Quiz)session.getAttribute("quiz");
        if(quiz==null){
        quiz= new Quiz();
        session.setAttribute("quiz", quiz);}
        
        int answer=Integer.parseInt(request.getParameter("ans"));
        int correctAnswer=Quiz.answers[quiz.getIndex()];
        
        if(answer==(correctAnswer)){
            quiz.incrementScore();
           
        }
         quiz.incrementIndex();
         
         if(quiz.getIndex() == 4){
         PrintWriter out = response.getWriter();
         response.setContentType("text/html");
         int score = quiz.getScore()+1;
         int index = quiz.getIndex()+1;
         out.print("<h1> The End ! <br> "+
                 "Your score is : "+score+" out of "+
                index);
         session.invalidate();
         }else{
         request.getRequestDispatcher("Number.jsp").forward(request, response);
         }
         
        
    }

   
    @Override
    public String getServletInfo() {
 
        return "Your score is now ";
    }

}
