/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kadai7;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**以下の仕様を満たすクラスを作成してください。 

また，処理が正しく書かれていることを確認するために，作成したクラスを呼び出すクラス（以下，実行クラスと言います）を
別途作成し，実行クラスからインスタンス化・メソッド呼び出しを行ってください。 

■継承 
・このクラスは，課題「クラスの作成」で作成したクラス（実行クラスではないほう。以下，親クラスといいます）を継承する。 
■フィールド 
親クラスから継承されているフィールド以外に，フィールドはない。 
■メソッド 
親クラスから継承されているメソッド以外に，以下のメソッドを追加する。 
①以下の条件を満たすメソッド 
・引数　なし 
・戻り値　なし 
・処理内容 
　フィールドの値をクリアする（「クリアする」とは，フィールドが int 型であれば 0，String 型であれば空文字や null といった値に変更するということ）
 * **/

class hito2 extends hito{ //同じファイル内のoutput28のhitoクラスを継承
    void hakusi(){
        this.na=null;
        this.ag=0;
     }
    
}

public class output29 extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           hito2 nakami2=new hito2();
         
           nakami2.hakusi();
           
           String nam=nakami2.na;
           int toshi=nakami2.ag;
           out.print(nam);
           out.print(toshi);
          
           
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
