/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kadai8;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Random;
/**
 * トランプゲームのBlackJackを作成します。

今回作成するBlackJackは、以下の条件を満たしていればＯＫです。

トランプのマークは意識しなくても良いです。1-13×4の52枚。

チップの概念は不要です。

1は1と11で計算可能ですが、1に固定してもＯＫです。

全自動でＯＫです。プレイヤーにHitの判断をさせる必要はありません。
* 
 Humanという抽象クラスを作成し、以下を実装してください。

openというabstractな公開メソッドを用意してください。
setCardというArrayListを引数とした、abstractな公開メソッドを用意してください。
checkSumというabstractな公開メソッドを用意してください。
myCardsというArrayListの変数を用意してください。
* 
* 
１.で作成した抽象クラスを継承して、以下のクラスを作成してください。
Dealerクラス
Userクラス
* 
2.まずはDealerクラスを完成させます。
cardsというArrayListの変数を用意し、初期処理でこのcardsに全てのトランプを持たせてください。
dealという公開メソッドを用意し、cardsからランダムで2枚のカードをArrayListにして返却してください。
hitという公開メソッドを用意し、cardsからランダムで1枚のカードをArrayListにして返却してください。
* 
3.DealerとUser両方に必要な処理を実装し、完成させます。
setCardは、ArrayListで受けたカード情報をmyCardsに追加するように実装してください。
checkSumは、myCardsを確認し、まだカードが必要ならtrue、必要無ければfalseを返却するように実装してください。
openは、myCardsのカードの合計値を返却するように実装してください。
* 
* 
4.DealerとUserクラスを使って、BlackJackを行ってください。
BlackJackの舞台は、Servletクラスでも、Javaクラスのpublic static void mainでも構いません。
カードのやり取りは自動で構いません、カードの変化と最終結果を表示してください。
**/


public class output30 extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
        try (PrintWriter out = response.getWriter()) {
            Dealer D=new Dealer();
            User U=new User();
           
       
       //🔶ディーラーの手札
        D.setCard(D.deal());  
        out.print("Dealerが最初に引いたのは"+D.myCards.get(0)+"と"+D.myCards.get(1)+"です。<br>");
        //手札に2枚カードを入れる       
        if(D.checkSum()){   
            int Dcount= 0;//ヒット回数
           //合計値のチェック
         while(D.checkSum()){    
            out.print("Dealerは"+D.open()+"なので1枚　HITします。<br>");
            D.setCard(D.hit()); 
            Dcount++;//ヒットを1増やす。
            out.print(D.myCards.get(1+Dcount)+"を追加します。<br>");//手札に1枚カードを入れる        
        }
            out.print("Dealerは"+D.open()+"です。<br>");//17以上は表示           
        }else{
            out.print("Dealerは"+D.open()+"です。<br>");//17以上は表示
        }
            int Dtotal=D.open();           
             out.print("<br>");//行間
           
        //🔶ユーザー手札
        U.setCard(D.deal()); //手札に2枚カードを入れる  
        out.print("Userが最初に引いたのは"+U.myCards.get(0)+"と"+U.myCards.get(1)+"です。<br>");
        int Ucount= 0;//ヒット回数
          //合計値のチェック 
        if(U.checkSum()){             
          while(U.checkSum()){
                out.print("Userは"+U.open()+"なので1枚　HITします。<br>");
                U.setCard(D.hit());  //手札に1枚カードを入れる 
                Ucount++;//ヒットを1増やす。
                out.print(U.myCards.get(1+Ucount)+"を追加します。<br>");
                
                }
                out.print("Userは"+U.open()+"です。<br>");//17以上は表示          
        }else{           
                out.print("Userは"+U.open()+"です。<br>");//17以上は表示
         }
         int Utotal=U.open();
           
           out.print("<br>");//行間
           
         //🔶ブラックジャック設定  
           //判定の目安の初期値
             int Dpoint= 21-Dtotal;
            int Upoint= 21-Utotal;
           //勝敗判定
            if(Dpoint<0||Upoint<0){   //Bustした場合
            if(Dpoint<0&&Upoint<0){
              out.print("どちらもBustしたので引き分けです");
            }else if(Dpoint<0&&Upoint>=0){
              out.print("DealerがBustしたのでUserの勝ちです。");
            }else if(Upoint<0&&Dpoint>=0){
             out.print("UserがBustしたのでDealerの勝ちです。");
             }
            }else{
            if(Dpoint>Upoint){   //User勝利条件
                  out.print("Userの勝ちです");                
                 }else if(Dpoint==Upoint){  //同数の条件               
                 out.print("引き分けです");             
                 }else{     //Dealer勝利条件
                 out.print("Dealerの勝ちです");  
                } 
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
