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
public class output13_add extends HttpServlet {

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
             //追加ページ
            
            String add_name= request.getParameter("A_name");//商品名
            int add_pr=Integer.parseInt(request.getParameter("A_pr"));
            int add_type=Integer.parseInt(request.getParameter("type"));//商品種類
           
            //追加ページの設定
            Connection add_con = null;
            PreparedStatement add_st = null;
            ResultSet add_data = null;
    
     try {
         Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
         add_con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db?characterEncoding=UTF-8&serverTimezone=JST",
            "Masa","masa0119");//URLがjdbc:mysql://localhost:3306/Challenge_db だと文字化け起こす。
         add_st=add_con.prepareStatement("insert into menu(Pname,Per,KindID)values(?,?,?) ");
         add_st.setString(1, add_name);
         add_st.setInt(2, add_pr);
         add_st.setInt(3, add_type);
         add_st.executeUpdate();
         add_st= add_con.prepareStatement("SELECT * FROM menu");
         add_data=add_st.executeQuery();
         
         if(add_data.next()){
             response.sendRedirect("http://localhost:8080/DB1/output13_menu.html");
         }else{
             response.sendRedirect("http://localhost:8080/DB1/output13_add.html");
         }
         
         add_data.close();
        add_st.close();
        add_con.close();
     }catch (Exception e_con){
            System.err.println(e_con);
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
