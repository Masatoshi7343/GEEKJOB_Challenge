<%-- 
    Document   : output45_1
    Created on : 2018/05/31, 20:11:55
    Author     : guest1Day

クエリストリングを利用して数値を受け取り，その値について，以下の仕様を満たす簡易的な素因数分解を行うロジックを記述してください。

■表示例 
例１「 84 = 2 * 2 * 3 * 7 」 
例２「396 = 2 * 2 * 3 * 3 あまり 11 」 
例３「997 = あまり 997 」 

■説明 
・例１にあるように，原則，すべての素数を列挙し，元の値とともに画面表示してください。 
・例２にあるように，求める素因数は，１桁のもののみとします。このとき，分解しきれなかった数については，「あまり○」の要領で表示させてください。 
・例３にあるように，対象とする数が素数の場合に，特別な処理を記述する必要はありません。ただし，「この数は素数です」といった表示を行っても構いません。

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
            request.setCharacterEncoding("UTF-8");           
                       
            // テキストボックスの情報
            String to= request.getParameter("total");
           int Atotal =Integer.parseInt(to);
           String i= "";
           Integer[] sosu={2,3,5,7};
                   
             for(int Sosu:sosu){//素因数分解
                 while(Atotal%Sosu ==0 ){ //配列が割り切れなかったら終了。
                     
                 Atotal= Atotal/Sosu;                               
                 out.println(i+Sosu);
                 i="*";
                 }                            
               }
             
             if(Atotal!=1){
                 out.print("あまり"+Atotal);
             }
            %>
        </h1>
    </body>
</html>
