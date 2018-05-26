/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kadai9;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author guest1Day
 * 🔶ファイルの書き出しと保存
 * 自己紹介の記述されたテキストファイルを作成してください。
 * ファイルの作成は，File クラスなどを利用することによって行ってください。
 */
public class output38 {
    public static void main(String[] args){
        
        
        try {
            File pr =new File("test.txt");//ファイルオープン
            FileWriter fpr =new FileWriter(pr);
            fpr.write("私の名前はサトウ　マサトシです。");//書き込み
            fpr.close();//クローズ
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}    
    
    
