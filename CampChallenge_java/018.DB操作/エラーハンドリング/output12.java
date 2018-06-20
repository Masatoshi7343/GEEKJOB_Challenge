/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kadai9;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
 複合検索 
 * 
 以下のファイルを作成して，フォームで送信した値をもとにレコードの検索を行います。 

■ HTML ファイル 
大単元「データベース基礎」の課題「テーブルの作成とinsert」で作成したテーブルの名前・年齢・誕生日情報を送信するフォームを記述してください。 

■ JSP or サーブレットファイル（サーブレットとJSPを連携させても構いません） 
JDBC を利用して，複合検索処理を記述します。AND検索とするか，OR検索とするかは，自由に決めて構いません。
 */
public class output12 extends HttpServlet {

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
             String n= request.getParameter("h_name");//nameカラム
             String s_age= request.getParameter("h_age");
             int age=Integer.parseInt(s_age);//型変換（文字→数値）、ageカラム
             String b= request.getParameter("h_bday");//birthdayカラム
            
    Connection db_con = null;
    PreparedStatement db_st = null;
    ResultSet db_data = null;
     try {
    Class.forName("com.mysql.cj.jdbc.Driver").newInstance();  
    db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db?characterEncoding=UTF-8&serverTimezone=JST",
            "Masa","masa0119");//URLがjdbc:mysql://localhost:3306/Challenge_db文字化け起こす。
    db_st=db_con.prepareStatement("SELECT * FROM profiles where name like ? OR age=? OR birthday like ?");
    db_st.setString(1,"%"+n+"%");
    db_st.setInt(2,age);
    db_st.setString(3,"%"+b+"%");
                                           
    db_data = db_st.executeQuery();
    
    while(db_data.next()){
      out.println("ID:"+db_data.getInt("profilesID")+"名前：" + db_data.getString("name")
      +"tel:" +db_data.getString("tel")+"年齢："+db_data.getInt("age")+"誕生日:"+db_data.getString("birthday")+"<br>");
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
