/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kadai9;


import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * 🔶タイムスタンプの表示
 * 「2016年11月4日 10時0分0秒」の情報を持つタイムスタンプ（ミリ秒）を生成し，画面に表示してください。
その後，さらにこの情報を「2016-11-04 10:00:00」の形式で画面に表示してください。
 * @author guest1Day
 */
public class output33 {
    public static void main (String[] args){
        Calendar timeA =Calendar.getInstance();
        
        
         //2016年11月4日 10時0分0秒
        timeA.set(2016,10,4,10,0,0);
        System.out.println(timeA.getTime().getTime());//表示+改行（println）
        
       //タイムスタンプのデータ（Calendarクラス）を文字列（Date型）にに変換 
        Date timeB = new Date(timeA.getTime().getTime());      
        SimpleDateFormat time= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.print(time.format(timeB));
        
    }
    
}
