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
import java.sql.*;
/**
 *
 * @author guest1Day
 */
public class output09 extends HttpServlet {

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
             request.setCharacterEncoding("UTF-8");
           //名前
             String n= request.getParameter("name");//nameカラム
             String s_id=request.getParameter("id");
             int id =Integer.parseInt(s_id);//型変換（文字→数値）、profilesIDカラム
             String t= request.getParameter("tel");//telカラム
             String s_age= request.getParameter("age");
             int age=Integer.parseInt(s_age);//型変換（文字→数値）、ageカラム
             String b= request.getParameter("bday");//birthdayカラム
             
    Connection db_con = null;
    PreparedStatement db_st = null;
    ResultSet db_data = null;
     try {
    Class.forName("com.mysql.cj.jdbc.Driver").newInstance();  
    db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db?characterEncoding=UTF-8&serverTimezone=JST",
            "Masa","masa0119");//URLがjdbc:mysql://localhost:3306/Challenge_db文字化け起こす。
    db_st=db_con.prepareStatement("INSERT INTO profiles(profilesID,name,tel,age,birthday)VALUES(?,?,?,?,?)");
    db_st.setInt(1,id);
    db_st.setString(2,n);
    db_st.setString(3, t);
    db_st.setInt(4,age);
    db_st.setString(5,b);
    db_st.executeUpdate();
    
    db_st= db_con.prepareStatement("SELECT * FROM profiles");                                       
    db_data = db_st.executeQuery();
                       
    while(db_data.next()){
      out.println("ID:"+db_data.getInt("profilesID")+"名前：" + db_data.getString("name")
      +"tel:" +db_data.getString("tel")+"年齢："+db_data.getInt("age")+"誕生日:"+db_data.getString("birthday"));
    }
    
        db_data.close();
        db_st.close();
        db_con.close();
            
        }catch (Exception e_con){
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
