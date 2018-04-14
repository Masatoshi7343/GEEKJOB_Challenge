<%-- 
    Document   : challenage1-8
    Created on : 2018/04/12, 22:17:44
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
            <%@page import="java.util.ArrayList" %>
            <%
              ArrayList<String> data = new ArrayList<String>();
              
              data.add("10");
              data.add("100");
              data.add("soeda");
              data.add("hayashi");
              data.add("-20");
              data.add("118");
              data.add("END");
              
              data.set(2,"33");
              
              out.print(data);
              out.print(data.size());
              
             %>
        </h1>
    </body>
</html>
