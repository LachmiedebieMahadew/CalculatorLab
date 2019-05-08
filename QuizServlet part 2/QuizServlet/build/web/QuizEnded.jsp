<%-- 
    Document   : QuizEnded.jsp
    Created on : May 6, 2019, 10:53:36 PM
    Author     : Kadjal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quiz Score</title>
        <style>
            p{ color:red;}
        </style>
    </head>
    <body>
        <form action="QuizServlet" method="post">
        <h1>Quiz ended</h1>  
        "Your score is : "+${quiz.getScore()} +" out of "+
                ${quiz.getIndex()});
    
                Your final grade = <p>${quiz.computeGrade()}</p>
                
                </form> </body>
</html>
