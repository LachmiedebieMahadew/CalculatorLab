<%-- 
    Document   : Quiz.jsp
    Created on : May 7, 2019, 11:04:21 PM
    Author     : Kadjal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quiz page</title>
        <link href="number.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <form  action="JspQuizServlet" method="post" >
            
            Enter your age : <input type="text" name="age" value=${age}/>
        <br>
        <h1>The Number Quiz</h1>
        Your score is ${quiz.score}
        <br><br>
        Guess the next number in the sequence
        <br><br>
        ${quiz.getQuestion()[quiz.index]}
        <br><br>
        <a href="#" data-toggle="tooltip" title=${quiz.getHint()}>Hint</a>
        Your answer  <input type="text" name="ans">
        <br><br>
        <input type="submit"  value="Submit">
        </form>
    </body>
</html>
