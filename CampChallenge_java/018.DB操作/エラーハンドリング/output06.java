/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kadai4;

import java.sql.*;
/**
 *特定のレコードの削除
ステータス

未提出
JDBC を利用して，削除処理を記述します。 
課題「テーブルへ情報を格納」で挿入したレコードを削除してください。その後，全件検索を行い，全レコードの全カラムを画面表示してください。
 */
public class output06 {
    public static void main(String[] ager){
     Connection db_con = null;
    PreparedStatement db_st = null;
    ResultSet db_data = null;
     try {
    Class.forName("com.mysql.cj.jdbc.Driver").newInstance();  
    db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db?characterEncoding=UTF-8&serverTimezone=JST",
            "Masa","masa0119");//URLがjdbc:mysql://localhost:3306/Challenge_db文字化け起こす。
                System.out.println(db_con+"クリア1");//チェック1
    db_st = db_con.prepareStatement("DELETE FROM profiles WHERE profilesID=? ");
    db_st.setInt(1,3);
    db_st.executeUpdate();
    db_st= db_con.prepareStatement("SELECT * FROM profiles");
                 System.out.println(db_st+"クリア2");//チェック2                             
    db_data = db_st.executeQuery();
                        System.out.println(db_data+"クリア3");//チェック3
    while(db_data.next()){
       System.out.println("ID:"+db_data.getInt("profilesID")+"名前：" + db_data.getString("name")
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
