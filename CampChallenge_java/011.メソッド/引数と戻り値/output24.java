/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kadai5;

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
public class output24 extends HttpServlet {
     
   
    
    String[] pro(String ID){          
        
             switch (ID) {
                case "1234":
                 String[] dateA={
             "ID:1234","生年月日：2018.6.9", "住所：千代田区外神田5-10",
                    };
                 return dateA;
                case "1111":
                    String[] dateB={
            "ID:1111","生年月日：2018.7.9", "住所：千代田区外神田6-11",
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

  
/**ユーザー定義メソッドを作成してください。引数・戻り値・処理内容については，以下の通りです。 

・引数 
　文字列型 ：PrintWriter pr
・戻り値 　　　
　文字列型を要素に持つ配列型 ：　String [] メゾット名
・処理内容 
　３人分のプロフィール情報を，それぞれ配列で作成してください（プロフィール情報の項目は，課題「戻り値2」と同様です）。
 * そして，引数として受け取った ID の値と同じ ID の値を持つ配列を，戻り値として返してください。 

メソッドの呼び出し側の記述については，課題「戻り値2」と同様としてください。**/
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
           
          String ID=("1111");  //初期値
          
          
          for (int i =1; i <3; i++ ){ //処理内容
            out.print(pro(ID)[i]);
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
