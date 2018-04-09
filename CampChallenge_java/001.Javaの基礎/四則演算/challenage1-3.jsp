<%-- 
    Document   : challenage1-3
    Created on : 2018/04/09, 22:07:11
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            <%
                final int number =100;
                int num =5;
                
               out.print(num+number);
                out.print(num++);   
                 out.print(num);
            %>
        </h1>
    </body>
</html>
