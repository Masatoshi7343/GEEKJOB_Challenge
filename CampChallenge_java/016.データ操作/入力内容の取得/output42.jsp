<%-- 
    Document   : output42
    Created on : 2018/05/26, 19:43:48
    Author     : guest1Day


課題「入力フィールド」で作成した HTML のフォームから値を送信し，
サーブレットか JSP で受け取ってください。また，受け取った値を画面に表示してください。

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
            <%
            // 受け取るパラメータの文字コード
            request.setCharacterEncoding("UTF-8");
            // テキストボックスの情報
            out.println(request.getParameter("ndata"));
            // チェックボックスの情報
            out.println(request.getParameter("sdata"));
            // テキストエリアの情報
            out.print(request.getParameter("hdata"));
            
            
        %>
        
    </body>
</html>
