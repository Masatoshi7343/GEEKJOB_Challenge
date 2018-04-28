/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kadai6;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author guest1Day
 */
public class output25 extends HttpServlet {
    
    String[] pro(String ID0){          
        
      switch (ID0) {
                case "1234":
                 String[] dateA={
             "ID:1234","生年月日：2018.6.9", "住所：千代田区外神田5-10",
                    };
                 return dateA;
                case "1111":
                    String[] dateB={
            "ID:1111","生年月日：2018.7.9<br>", null,
                    };
                    
                    return dateB;
                case "2222":
                    String[] dateC={
             "ID:2222","生年月日：2018.8.9", "住所：千代田区外神田7-12",
                    };
                    return dateC;
                default:
                    break;
            }
           String[] deta0={"登録されていません","登録されていません","登録されていません"};
            return deta0;
            
       
    }

    
    /**
     ユーザー定義メソッドを作成してください。引数・戻り値・処理内容については，以下の通りです。
・引数　文字列型
・戻り値　配列（ArrayList で実現してもOK）
・処理内容
　３人分のプロフィール情報を，それぞれ配列で作成してください（プロフィール情報の項目は，課題「引数、戻り値1」と同様です）。
 * ただし，そのうちの１人については，住所 の値を null にしてください。
　そして，引数で受け取った文字列と ID の値が一致する人物について，そのプロフィール情報の配列を戻り値としてください。

　メソッドを作成したら，このメソッドを適宜呼び出し，３人分のプロフィール情報をすべて画面に表示してください。
 * ただし，値が null なデータについては continue; を利用して画面表示をスキップしてください。
     **/
     

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            String[] ID0=pro("1234");  //初期値
            String[] ID1=pro("1111");
            String[] ID2=pro("2222");
            
          
          for (int i =0; i <3; i++ ){ //処理内容
            out.print(ID0[i]);
            }
          
         for (int i =0; i <3; i++ ){
             if(ID1[2]==null){
                 continue;
             }{
             out.print(ID1[2]); 
             }
             
            out.print(ID1[i]);
             }
         for (int i =0; i <3; i++ ){ 
            out.print(ID2[i]);
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
