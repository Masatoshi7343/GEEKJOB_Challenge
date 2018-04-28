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
public class output26 extends HttpServlet {
 
    String[] pro(String ID){          
        
      switch (ID) {
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
    
    /**課題「引数，戻り値２」を改修します。
整数型の変数 limit を値 2 で用意してください。
そして，limit を利用して，表示するプロフィール情報を２名分のみにしてください。
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
            int limit=2;
            String[][] IDnum ={ID0,ID1,ID2 };
                    
             
          for (int i =0; i <limit; i++ ){ //[i]:各ID0～ID2が入っている大箱[j]:ID0～ID2のなかに入れてある中身//
              for(int j=0;j<3;j++){
                  if(IDnum[i][j]==null){
                      continue;
                  }                                   
                 out.print(IDnum[i][j]); 
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
