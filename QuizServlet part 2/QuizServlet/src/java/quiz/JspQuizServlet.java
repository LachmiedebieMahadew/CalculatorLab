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
public class JspQuizServlet extends HttpServlet {
 public class NumberQuizServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        Quiz q = (Quiz) session.getAttribute("quiz");
        Age a = (Age) session.getAttribute("age");

        if (q == null) {
            q = new Quiz();
            session.setAttribute("quiz", q);
        }

        if (a == null) {
            a = new Age();
            session.setAttribute("age", a);
        }

        request.getRequestDispatcher("/Quiz.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        Quiz q = (Quiz) session.getAttribute("quiz");
        Age a = (Age) session.getAttribute("age");

        if (q == null) {
            q = new Quiz();
            session.setAttribute("quiz", q);
        }

        if (a == null) {
            a = new Age();
            session.setAttribute("age", a);
        }

        request.setAttribute("age", String.valueOf(a.getAge()));

        try {
            if (a.getAge() == 0) {
                a.setAge(Integer.parseInt(request.getParameter("age")));
                if (a.getAge() < 4 || a.getAge() > 100) {
                    throw new NumberFormatException();
                }

                if (a.getAge() > 4 && a.getAge() < 100) {
                    request.setAttribute("age", String.valueOf(a.getAge()));
                }

            }

        } catch (NumberFormatException e) {
            request.getRequestDispatcher("/AgeInstruction.html").forward(request, response);
            session.invalidate();
        }

        if (request.getParameter("answer").equals(String.valueOf(Quiz.answers[q.getIndex()]))) {
            q.calculateScore(q.getTries());
            //q.incrementScore();
            q.incrementIndex();
            q.resetTries();

        } else {
            q.decrementTries();
            if (q.getTries() == 0) {
                q.incrementIndex();
                q.resetTries();
            }
        }

        if (q.getIndex() == 5) {
            
            request.setAttribute("grade", q.computeGrade() );
            request.getRequestDispatcher("/FinalGrade.jsp").forward(request, response);
            session.invalidate();
        } else {
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
}