/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kadai4;

import java.sql.*;

/**
 *
 * @author guest1Day
 */
public class output4 {
    public static void main(String[] ager){
    Connection db_con = null;
    PreparedStatement db_st = null;
    ResultSet db_data = null;
     try {
    Class.forName("com.mysql.cj.jdbc.Driver").newInstance();  
    db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db?characterEncoding=UTF-8&serverTimezone=JST",
            "Masa","masa0119");//URLがjdbc:mysql://localhost:3306/Challenge_db文字化け起こす。
                System.out.println(db_con+"ok1");//チェック1
    db_st = db_con.prepareStatement("select * from profiles where profilesID = ?");
    db_st.setInt(1, 1);
                 System.out.println(db_st+"ok2");//チェック2
    db_data = db_st.executeQuery();
                    System.out.println(db_data+"ok3");//チェック3
    while(db_data.next()){
       System.out.println("ID:"+db_data.getString("profilesID")+"名前：" + db_data.getString("name")
      +"tel:" +db_data.getString("tel")+"年齢："+db_data.getString("age")+"誕生日:"+db_data.getString("birthday"));
    }
    
        db_data.close();
        db_st.close();
        db_con.close();
            
        }catch (Exception e_con){
             System.out.println("エラーです。"+e_con.getMessage());
          
        }
     }
}
