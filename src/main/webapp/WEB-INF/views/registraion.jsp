<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            
        </head>
        <body>
        <form:form id="regForm" modelAttribute="user" action="/registerProcess" method="post">
            <h1>hello world</h1>
	        </form:form>
    
        </body>
        </html>