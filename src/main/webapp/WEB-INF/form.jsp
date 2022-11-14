<%@ page language="java" contentType = "text/html; charset = UTF-8"
pageEncoding = "UTF-8" import = "java.util.Date"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
        <meta charset = "UTF-8">
        <title>Demo JSP</title>
<!-- 	<link rel = "stylesheet" type = "text/css" href = /css/style.css>  -->
    </head>
    <body>
            <!-- put names of variables etc in this comment -->
            <div class="container text-center border-secondary">
            
            <h1>Omikuji Form</h1>
            
            	<form action="/omikuji/fortuneTell" method = "post">
            		<label class ="form-label">enter the name of a city:</label>
            		<input class = "form-control" type ="text" name = "city">
            		<label class = "form-label">enter the name of a person:</label>
            		<input class = "form-control" type ="text" name = "person">
            		<label class = "form-label">enter the name of a hobby:</label>
            		<input class = "form-control" type ="text" name = "hobby">
            		<label class = "form-label">enter a compliment for yourself:</label>
            		<input class = "form-control" type = "text" name = "compliment">
            		<button class = "btn btn-secondary" type ="submit" value = "submit form"></button>
            	</form>
       
            </div>
            


 
        
        <script src="/webjars/jquery/jquery.min.js"></script>
		<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    </body>


</html>