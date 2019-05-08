<%-- 
    Document   : result.jsp
    Created on : May 8, 2019, 10:59:31 AM
    Author     : Kadjal
--%>
<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import= "java.util.*" %>
<link href="beer.css" rel="stylesheet" type="text/css"/>
<html>
<body>

    <form action="BeerSelect" method="post">
<h1 align=”center”>Beer Recommendations JSP</h1>
 Select beer characteristics<p>
 Color:
 <select name="color" size=1>
 <option value="light"> light </option>
 <option value="amber"> amber </option>
 <option value="brown"> brown </option>
 <option value="dark"> dark </option>
 </select>
 <br><br>
 <center>
 <input type="submit" value="Submit">
 </center>
</form>

</body>
</html>
