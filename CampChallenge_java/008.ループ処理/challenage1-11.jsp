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
                float key = 1000;
                while ( key>100 ) //100より小さい値になればループ終了。
                { key =key/2;      
                //計算過程を表示するときはここにout.print(key+"<br>");を入力
                }
                 out.print( key );
                
                
                       %>
        </h1>
    </body>
</html>
