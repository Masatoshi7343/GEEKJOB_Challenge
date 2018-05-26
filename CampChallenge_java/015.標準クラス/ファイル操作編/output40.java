/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kadai9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author guest1Day
 * 🔶標準クラスを利用して処理を作成標準クラスを利用して処理を作成
 * Java の標準クラスについて，これまでに扱っていないものを自身で調査し，その標準クラスを利用した処理を記述してください。 
その際，「ファイル操作編」の単元で学習した内容を利用して，以下の内容が記載されたログファイルを作成してください。 

1. 処理の内容（例：文字列の置換） 
2. 処理を開始する旨と，その時刻（例：2000-01-01 12:00 開始） 
3. 処理を終了する旨と，その時刻（例：2000-04-04 11:00 終了） 
※ なお，ログファイルとは，一定の記録（Log）が記述されたファイルの一般的な名称です（特定のファイル形式を指すものではありません）。


 */
public class output40 {
    public static void main(String[] agre){
   try{
    //2.処理を開始する旨と，その時刻
     
    SimpleDateFormat time= new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒LL");
     Date nowtime = new Date(); //処理開始の時間
     
    File log =new File("log.txt");//ファイルの作成
    //2.処理を開始する旨と，その時刻
    FileWriter startlog =new FileWriter(log);
    startlog.write(time.format(nowtime));
    startlog.close();
   
    FileReader slog = new FileReader(log);
    BufferedReader sl = new BufferedReader(slog);
    System.out.println(sl.readLine()+"　開始");
    sl.close();
    
     
    //  1.内容：文字列の結合と追加
    StringBuffer fname= new StringBuffer("Sato");
    StringBuffer mname= new StringBuffer("Masatoshi");
    
    System.out.println(fname);
    System.out.println(mname);
    
    fname.append(mname); //文字の結合
    System.out.println(fname);
    
    fname.insert(13," (サトウマサトシ)");//文字列の追加
  
     System.out.println(fname);
    Date lasttime = new Date(); //処理終了の時間
      
     //3.処理を終了する旨と，その時刻
    FileWriter lastlog =new FileWriter(log);
    lastlog.write(time.format(lasttime));
    lastlog.close();
          
    FileReader llog = new FileReader(log);    
    BufferedReader ll = new BufferedReader(llog);
    System.out.println(ll.readLine()+"　終了");
    ll.close();
    
   } catch (IOException e) {
       
   }
     
     }
}
