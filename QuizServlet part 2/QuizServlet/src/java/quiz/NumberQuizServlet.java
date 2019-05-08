/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Kadjal
 */
@WebServlet("/NQ")
public class NumberQuizServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                HttpSession session = request.getSession();
        Quiz q = (Quiz) session.getAttribute("quiz") ;
        
        
        if(q == null){
        q = new Quiz();
        session.setAttribute("quiz", q);
        }

        request.getRequestDispatcher("/NumberQuiz.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        Quiz q = (Quiz) session.getAttribute("quiz") ;
        
        
        if(q == null){
        q = new Quiz();
        session.setAttribute("quiz", q);
        }
           
        
        if(request.getParameter("answer").equals(String.valueOf(Quiz.answers[q.getIndex()]))){
            q.incrementIndex();
            q.incrementScore();
        }else{
            q.incrementIndex();
        }
        
        //        int score = q.getScore();
        session.setAttribute("score", q.getScore());
        
        session.setAttribute("question", Quiz.getQuestion()[q.getIndex()]);

        
//        int count = q.getCount();
//        String question = Quiz.questions[q.getCount()];
        
        if(q.getIndex() == 4 ){
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<h1> The End </h1> <br>"
                + "You Score is :  "+q.getScore());
        session.invalidate();
        }else{
        request.getRequestDispatcher("/NumberQuiz.jsp").forward(request, response);
        }
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
