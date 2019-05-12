<%-- 
    Document   : FinalGrade
    Created on : May 8, 2019, 1:33:37 AM
    Author     : Anish
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/grade.css" rel="stylesheet" type="text/css"/>
        <title>Final Grade</title>
    </head>
    <body>
        <form  action="NQ" method="post" >
            
            <h1>Your grade is : <span>${grade}</span>  </h1> 
            <a href="index.html" > Retake Quiz! </a>
            
        </form>
    </body>
</html>
