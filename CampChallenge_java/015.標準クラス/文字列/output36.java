/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kadai9;

/**
 *
 * @author guest1Day
 *🔶文字数の取得
 * 変数を宣言し，自分のメールアドレス（架空のものでも構いません）をその値としてください。
 * その後，String クラスのメソッドを利用して，メールアドレスの「@」以降の文字数を画面に表示してください。
 */
public class output36 {
    public static void main(String[] agre){
    String mail="cross0up5road8@gmail.com";
    
    /*確認のために使用
    System.out.println(mail.indexOf("@"));//"@"までの指定位置の取得
    System.out.println(mail.substring(mail.indexOf("@")));//"@"以降の文字を処理
    */
    System.out.print(mail.substring(mail.indexOf("@")).length());//文字数の取得
    
}
}
