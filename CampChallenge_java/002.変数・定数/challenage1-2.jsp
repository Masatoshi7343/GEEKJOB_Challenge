<%-- 
    Document   : challenage1-2
    Created on : 2018/04/07, 19:40:40
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
               
                String name ="よろしくお願いします！";
                
                  out.print("はじめまして、私の名前は佐藤政俊です！");
                    out.print(name);
            %>
        </h1>
    </body>
</html>
