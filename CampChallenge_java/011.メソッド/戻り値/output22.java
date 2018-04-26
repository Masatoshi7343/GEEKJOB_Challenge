/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kadai4;

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
public class output22 extends HttpServlet {
    
    boolean myprofile(PrintWriter pw) {
             //ユーザーメゾット定義作成。
             
             pw.print("私の名前は佐藤です<br>");
             pw.print("1992年4月19日<br>");
             pw.print("現在就職活動中です。<br>");
             return true;
    }
    
    
    
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
           
                 
                        boolean result= myprofile(out);// ユーザー定義関数の呼び出し
                       
           if(result){
               out.print("この処理は正しく実行できました");
           }else{
                out.print("正しく実行できませんでした");
            }
                
           
            /* TODO output your page here. You may use following sample code. */
/*①課題「ユーザー定義メソッドの作成」で作成したメソッドを改修します（ファイルは新規に作成してください）。
            引数・戻り値・処理内容については，以下の通りです。

・②引数　PrintWriter型
・③戻り値　boolean型
　このメソッドは，つねに true を返します。

④メソッドを作成したら，このメソッドを呼び出し，戻り値に応じて以下の条件判断を行ってください。
true ... 「この処理は正しく実行できました」と画面に表示
false ... 正しく実行できませんでした」と画面に表示*/
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
