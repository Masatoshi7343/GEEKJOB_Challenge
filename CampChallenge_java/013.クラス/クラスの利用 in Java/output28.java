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

/**
 * 以下の仕様を満たすクラスを作成してください。 
また，処理が正しく書かれていることを確認するために，作成したクラスを呼び出すクラス（以下，実行クラスといいます）を別途作成し，
実行クラスからインスタンス化・メソッド呼び出し等を行ってください。 

■フィールド 
２つのフィールドを用意する。フィールドがどんな情報を持つかは，自由とする。 
■メソッド 
①以下の条件を満たすメソッド 
・引数 
　２つの引数を取る。データ型は，それぞれフィールドのデータ型と同じものとする。 
・戻り値　なし 
・処理内容 
　引数として受け取った２つの変数を，フィールドに格納する。 
②以下の条件を満たすメソッド 
・引数　なし 
・戻り値　なし 
・処理内容 
　２つのフィールドの値をそれぞれ画面に表示する。**/
class hito {
             String na="";
             int ag= 0;
   
            void pro(String a,int b){
             this.na = a;
             this.ag= b;
            }        
            void open(){
            System.out.print(na);
            System.out.print(ag);
           }
}
    
 


/**
 * 
 *
 * @author guest1Day
 */
public class output28 extends HttpServlet {    
     
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter A = response.getWriter()) {
          hito nakami=new hito();
       nakami.pro("sato",26);
       nakami.open();
       
        String name=nakami.na;
        int age=nakami.ag;
      
       A.print("私の名前は"+name+"です。<br>歳は"+age+"歳です。");
        
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
