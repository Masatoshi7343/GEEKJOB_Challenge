<%-- 
    Document   : challenage1-7
    Created on : 2018/04/12, 19:43:55
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
        char type='r';
        
        switch(type){
            case 'A':
               out.print("英語");
               break;
            case 'あ' :
                out.print("日本語");
                break;     
            default:
                out.print("");
                break;
        }
        %>
        </h1>
    </body>
</html>
