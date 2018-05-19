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
 */
public class output31_1 {
     public static void main(String[] args){
        Calendar Ctime =Calendar.getInstance();
        
        //2016年1月1日 0時0分0秒
        Ctime.set(2016,0,1,0,0,0);
        
        System.out.println(Ctime.getTime());//日付の表示
        
        System.out.print(Ctime.getTime().getTime());//タイムスタンプ表示
    }
    
}
