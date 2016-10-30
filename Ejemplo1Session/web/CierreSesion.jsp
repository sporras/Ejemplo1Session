<%-- 
    Document   : CierreSesion
    Created on : 29/10/2016, 07:22:44 PM
    Author     : Irene
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    HttpSession cerrar = request.getSession();
   cerrar.invalidate();
   response.sendRedirect("SesionFinalizada.html");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
