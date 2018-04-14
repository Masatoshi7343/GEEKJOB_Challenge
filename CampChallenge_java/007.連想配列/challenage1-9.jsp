<%-- 
    Document   : challenage1-9
    Created on : 2018/04/14, 12:49:35
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
            <%@page import ="java.util.HashMap" %>
            <%
            HashMap<String,String> prof=new HashMap<String,String>();
            
            prof.put("1","AAA");
            prof.put("hello", "world");
            prof.put("soeda", "35");
            prof.put("20", "20");
            prof.put("yes","no");
            
            prof.put("soeda", "33");
            prof.remove("yes");
            
            out.print(prof);
            out.print(prof.size());
            %>
            
            
        </h1>
    </body>
</html>
