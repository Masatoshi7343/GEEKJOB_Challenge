<%-- 
    以下の機能を実現してください。 
・名前，性別，趣味の情報をフォームによって送信することができる。 
・フォームによって値を送信すると，次回アクセス時に，その値がフォームの初期値となる（セッションかクッキーを利用する）。
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
            <%HttpSession se=request.getSession();%>
            <form action="http://localhost:8080/Sample2/output48" method="post" >
            名前
            <p><input type="text" name="name" size="10"  
                      value= <% if(se.getAttribute("Name")==null){out.print("");}
                                 else{out.println(se.getAttribute("Name"));} %>></p>
           
            性別
            <p><input type="text" name="sd" size="10"  
                      value= <% if(se.getAttribute("Se")==null){out.print("");}
                      else{out.println(se.getAttribute("Se"));} %>></p>
             
            趣味
             <p><input type="text" name="syumi" size="10" 
                       value=<%if(se.getAttribute("sy")==null){out.print("");}
                                else{out.println(se.getAttribute("sy"));} %>
                       > </p>
                <input type="submit" name="botan" value="ログイン">
            </form>
        </h1>
    </body>
</html>
