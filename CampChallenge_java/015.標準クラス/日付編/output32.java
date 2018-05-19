/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kadai9;


import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author guest1Day
 * 
 * 現在の日時を「1988年5月21日 1時23分45秒」といった形式で表現してください。
 * 
 */
public class output32 {
    public static void main(String[] ager){
        Date nowtime = new Date();
        
        SimpleDateFormat time= new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒");
        
        System.out.print(time.format(nowtime));
    }
}
