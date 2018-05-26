/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kadai9;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author guest1Day
 * 🔶ファイルから読み出しと表示
 * 課題「ファイルの書き出しと保存」で作成したテキストファイルを読み込み，その内容を画面に表示してください。
 */
public class output39 {
    public static void main(String[] args){
        
               
         try {
            File pr =new File("test.txt");//ファイルオープン
            FileReader fr  =new FileReader(pr);
            BufferedReader br =new BufferedReader(fr);
            System.out.print(br.readLine());
            fr.close();//クローズ
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
