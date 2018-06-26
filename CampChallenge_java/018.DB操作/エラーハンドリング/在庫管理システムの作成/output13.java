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
import javax.servlet.http.HttpSession;
/**
 *
 * @author guest1Day
 */
public class output13 extends HttpServlet {

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
           
           //13_1(ログインページ変数)
            String login_name= request.getParameter("p_name");//ユーザー名
            String login_pass = request.getParameter("p_pass");//パスワード
                         
            
    //ログインの設定        
    Connection login_con = null;
    PreparedStatement login_st = null;
    ResultSet login_data = null;
     try {
    Class.forName("com.mysql.cj.jdbc.Driver").newInstance();  
    login_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db?characterEncoding=UTF-8&serverTimezone=JST",
            "Masa","masa0119");//URLがjdbc:mysql://localhost:3306/Challenge_db文字化け起こす。
    login_st=login_con.prepareStatement("SELECT * FROM pass where name=? and passID=?");
    login_st.setString(1, login_name);
    login_st.setString(2, login_pass);
    login_data = login_st.executeQuery();
    
    if(login_data.next()){
        response.sendRedirect("http://localhost:8080/DB1/output13_menu.html");      
       
    }else{
       response.sendRedirect("http://localhost:8080/DB1/output13_1.html");       
    }
     
        login_data.close();
        login_st.close();
        login_con.close();
      
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
