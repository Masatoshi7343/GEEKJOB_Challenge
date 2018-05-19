/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kadai9;

import java.util.Calendar;
/**
 *
 * @author guest1Day
 * 
 * 🔶タイムスタンプの表示
 * 2015年1月1日 0時0分0秒と2015年12月31日 23時59分59秒の差（ミリ秒）を表示してください。
 */
public class output34 {
    public static void main(String[] agre){
        
        Calendar timeA =Calendar.getInstance();
        timeA.set(2015,0,1,0,0,0);
        System.out.println(timeA.getTime()+"のタイムスタンプは");  
        System.out.println(timeA.getTime().getTime()+"です。");
        
        Calendar timeB =Calendar.getInstance();
        timeB.set(2015,11,31,23,59,59);
        System.out.println(timeB.getTime()+"のタイムスタンプは");
        System.out.println(timeB.getTime().getTime()+"です。");
        
        long A=timeA.getTime().getTime();
        long B=timeB.getTime().getTime();
        
        System.out.print(B-A);
    }
}
