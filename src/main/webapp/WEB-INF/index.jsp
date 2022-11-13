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
	<link rel = "stylesheet" type = "text/css" href = /css/style.css> 
    </head>
    <body>
            <!-- attributes :name, itemName, price,description, vendor -->
            <div class="container text-center border-secondary">
            Types of Items You're Buying:

            <table class = "table table-secondary">
            <thead>
				
            	<tr scope = "row">
            			<th>Name</th>
            			<th>Price</th>
				</tr>
			
          
            </thead>
            	<tbody>
            <c:forEach var="fruit" items= "${fruits}">
            	<tr scope = "row">
            	<td ><p><c:out value= "${fruit.getName()}"></c:out> </p></td>
            	<td ><p><c:out value= "${fruit.getPrice()}"></c:out></p></td>
            	</tr>
            </c:forEach>  
            	</tbody>
            </table>
            <p><c:out value= "${fruit.getName()}"></c:out><p>
            </div>
            


 
        
        <script src="/webjars/jquery/jquery.min.js"></script>
		<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    </body>


</html>