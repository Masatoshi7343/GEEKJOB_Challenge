/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kadai9;

/**
 *
 * @author guest1Day
 * 🔶バイト数と文字数の取得
 * 自分の氏名について，バイト数と文字数を取得してください。
 * また，それぞれの値を画面に表示してください。
 * 
 */
public class output35 {
    public static void main(String[] args){
    String name= "サトウ　マサトシ";//空白入れて8文字
    
    System.out.println("文字数は"+name.length()+"です。");
    System.out.print("バイト数は"+name.getBytes().length+"です。");
    }
    
    
}
