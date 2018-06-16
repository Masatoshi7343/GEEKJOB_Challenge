/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kadai2;


import java.sql.*;
/**
 *
 * @author guest1Day
 */
public class output02 {
    public static void main(String[] ager){
    Connection db_con = null;
    PreparedStatement db_st = null;
     
    
    try {
    Class.forName("com.mysql.cj.jdbc.Driver").newInstance();  
    db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db?characterEncoding=UTF-8&serverTimezone=JST",
            "Masa","masa0119");//URLがjdbc:mysql://localhost:3306/Challenge_db文字化け起こす。
                System.out.println(db_con+"ok1");//チェック1
    db_st = db_con.prepareStatement("insert into profiles(profilesID,name,tel,age,birthday)values(?,?,?,?,?)");
    db_st.setInt(1, 3);
    db_st.setString(2,"佐藤　政俊");
    db_st.setString(3,"000-0000-0000");
    db_st.setInt(4,26);
    db_st.setString(5,"1992-05-01");
                 System.out.println(db_st+"ok2");//チェック2
       
        db_st.close();
        db_con.close();
            
        }catch (Exception e_con){
             System.out.println("エラーです。"+e_con.getMessage());
             
         }
    }
}
