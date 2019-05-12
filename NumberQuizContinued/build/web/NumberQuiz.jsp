<%-- 
    Document   : NumberQuiz
    Created on : May 5, 2019, 4:52:12 PM
    Author     : Anish
--%>

<%@page import="mum.cs472.Age"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Number Quiz</title>
        <link href="css/number.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
       
        <form action="NQ" method="post" >
             <h1>THE NUMBER QUIZ</h1>
            Enter your age : <input type="text" name="age" value=${age}  />
            <br>
            Your current score ${quiz.score}
            <br>
            Guess the next number in the sequence :
            <br>
            ${quiz.getQuestions()[quiz.count]}
            <br>
            <a href="#" data-toggle="tooltip" title=${quiz.getHints()[quiz.count]} >Hint ?</a>
            <br>
            Your answer: <input type="text" name="answer" />
            <br>
            <input type="submit" value="Submit" />
            
            
        </form>
        
    </body>
</html>
