<%-- 
    Document   : challenage1-6
    Created on : 2018/04/12, 19:21:32
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
                int type= 2;
              switch(type){
                  case 1:
                      out.print("one");
                  break;
                  case 2:
                      out.print("two");
                  break;
                  default:
                  out.print("想定外");
                  break;
              }
              
            %>
        </h1>
    </body>
</html>
