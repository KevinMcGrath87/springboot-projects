<%@ page language="java" contentType = "text/html; charset = UTF-8"
pageEncoding = "UTF-8" import = "java.util.Date"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset = "UTF-8">
        <title>Demo JSP</title>
        
    </head>
    <body>
            <!-- attributes :name, itemName, price,description, vendor -->
            <h1>
            Customer Name: 
                <c:out value ="${name}" />

            
            </h1>
            <p> item:
            <c:out value = "${itemName}"/></p>
            <p> price:
			<c:out value ="${price}" /></p>
			<p> decription:
            <c:out value = "${description}"/></p>
            <p>vendor:
            <c:out value ="${vendor}"/> 
            </p>

 
        
        
    </body>


</html>