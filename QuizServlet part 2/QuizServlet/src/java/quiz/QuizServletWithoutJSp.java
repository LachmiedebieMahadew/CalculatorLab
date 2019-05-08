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
public class QuizServletWithoutJSp  extends HttpServlet{
  @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        HttpSession session = request.getSession();
        Quiz quiz = (Quiz) session.getAttribute("quiz");
        
        
       if(quiz == null){
           quiz= new Quiz();
       session.setAttribute("quiz",quiz);
       }
     
        PrintWriter out = response.getWriter();
         response.setContentType("text/html");
         out.print("<html><head><title>Quiz page</title>");
         out.print("<link href=\\\"\"number.css\" rel=\"stylesheet\" type=\"text/css\"/></head><body>");
         out.print("<form  action=\"QuizServlet\" method=\"post\" >");
         out.print(" <h1>The Number Quiz</h1>\n" +
"        Your score is"+quiz.getScore()+"<br>" +
"        <br><br>\n" +
"        Guess the next number in the sequence\n" +
"        <br><br>");
         out.print(" Your answer  <input type=\"text\" name=\"ans\">\n" +
"        <br><br>\n" +
"        <input type=\"submit\"  value=\"Submit\">\n" +
"        \n" +
"        </form>\n" +
"    </body>\n" +
"</html>\n" +
"");
        
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
         }else
        {
           PrintWriter out = response.getWriter();
         response.setContentType("text/html");
         out.print("<html><head><title>Quiz page</title>");
         out.print("<link href=\\\"\"number.css\" rel=\"stylesheet\" type=\"text/css\"/></head><body>");
         out.print("<form  action=\"QuizServletWithoutJSp\" method=\"post\" >");
         out.print(" <h1>The Number Quiz</h1>\n" +
"        Your score is"+quiz.getScore()+"<br>" +
"        <br><br>\n" +
"        Guess the next number in the sequence\n" +
"        <br><br>");
         out.print(" Your answer  <input type=\"text\" name=\"ans\">\n" +
"        <br><br>\n" +
"        <input type=\"submit\"  value=\"Submit\">\n" +
"        \n" +
"        </form>\n" +
"    </body>\n" +
"</html>\n" +
"");
         
         
         
         
       
        
        }
        
    }

   
    @Override
    public String getServletInfo() {
 
        return "Your score is now ";
    }


  
}
