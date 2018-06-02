<%-- 
    Document   : output44_1
    Created on : 2018/05/29, 22:11:15
    Author     : guest1Day

■クエリストリング 
例）http://localhost:8080/_some_project_/_some_file_.jsp?total=1500&count=10&type=2 
・_some_project_ ... 自身のプロジェクト名に書き換えてください 
・_some_file_.jsp ... 自身で作成したファイル名等に書き換えてください（ JSP ではなくサーブレットによって処理を記述しても構いません） 
・total ... 購入した商品の総額を表す 
・count ... 購入した商品の数量を表す 
・type ... 商品種別を表す 
（type の数値は， 1 が「雑貨」，2 が「生鮮食品」， 3 が「その他」と対応します） 

■処理内容 
1. type の値を元に，商品種別の日本語情報を表示してください。 
2. 商品の単価を求め，画面に表示してください。 
3. 商品購入総額に応じてポイントを計算し，その値を画面に表示してください。なお，ポイントの計算は，商品購入総額を基準にして，以下の要領で行います。 
3000 円未満 ... 0% 
3000 円以上で5000円未満 ... 購入総額の 4% 
5000 円以上 ... 購入総額の 5%

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
            String to= request.getParameter("total");
            // チェックボックスの情報
           String co =request.getParameter("count");
            // チェックボックスの情報
           request.getParameter("type");
           
                  
           if(request.getParameter("type").equals("1")){   //処理1
               out.print("雑貨<br>");               
           }else if(request.getParameter("type").equals("2")){
               out.print("生鮮食品<br>");
           }else if(request.getParameter("type").equals("3")){
               out.print("その他<br>");
           }
           
           int tonum = Integer.parseInt(to);
         
           
           int conum = Integer.parseInt(co);
          
           int tanka= tonum/conum;
           out.print("単価は"+tanka+"円です。<br>"); //処理2
           
           if(tonum<3000){
               out.print("ポイントは0です。");
           }else if(tonum>=3000&&tonum<5000){
               int a = tonum*4/100;
               out.print("ポイントは"+a+"です。");
           }else if(tonum>=5000){
               int b =tonum*5/100;
               out.print("ポイントは"+b+"です。");
           }
           
 

        %>
    </body>
</html>
