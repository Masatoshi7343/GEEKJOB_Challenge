<%-- 
    Document   : challenage1-10
    Created on : 2018/04/14, 13:57:29
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
            String moji ="";
            int count=0;
            for ( int i = 1; i<=30; i++ ) {
                moji=moji+"A";
                 }
                out.print( moji );
                 %>
        </h1>
    </body>
</html>
