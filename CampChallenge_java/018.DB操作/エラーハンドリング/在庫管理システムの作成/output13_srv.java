/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lastKadai;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 *
 * @author guest1Day
 */
public class output13_srv extends HttpServlet {

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
            response.setCharacterEncoding("UTF-8");//送るときの文字列処理
           request.setCharacterEncoding("UTF-8");//受とるときの文字列処理
             //13_menu(検索ページ変数)
            String srv_name= request.getParameter("k_name");//商品名
            String k_id=request.getParameter("k_id");//管理番号
            int srv_id= 0;
            if(k_id.equals("")){ //検索時に無記名の場合
                srv_id=0;
            }else{
                srv_id=Integer.parseInt(k_id);
            }
            //商品検索の設定
     Connection srv_con = null;
    PreparedStatement srv_st = null;
    ResultSet srv_data = null;
     try {
    Class.forName("com.mysql.cj.jdbc.Driver").newInstance();  
    srv_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db?characterEncoding=UTF-8&serverTimezone=JST",
            "Masa","masa0119");//URLがjdbc:mysql://localhost:3306/Challenge_db文字化け起こす。
    srv_st=srv_con.prepareStatement("SELECT * FROM menu where Pname like ? or MGT=?");
    if("".equals(srv_name)){ // likeを使った場合の対策
        srv_st.setString(1,srv_name);
    }else{
        srv_st.setString(1,"%"+srv_name+"%");
    }
   
    srv_st.setInt(2, srv_id);
    srv_data = srv_st.executeQuery();
    
    while(srv_data.next()){
      out.println("管理番号:"+srv_data.getInt("MGT")+"商品名：" + srv_data.getString("Pname")
      +"単価:" +srv_data.getString("Per")+"種別番号："+srv_data.getInt("KindID")+"<br>"+"");
    }
        out.println("<form action=\"http://localhost:8080/DB1/output13_menu.html\" method=\"post\">");
        out.println("<input type=\"submit\" name=\"btnSubmit\" value=\"戻る\">  ");
        out.print("</form>");
     
        srv_data.close();
        srv_st.close();
        srv_con.close();
      
        }catch (Exception e_con){
            System.err.println(e_con);
             System.out.println("エラーです。"+e_con.getMessage());
          
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
