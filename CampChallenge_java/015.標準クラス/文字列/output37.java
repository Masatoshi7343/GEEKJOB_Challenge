/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kadai9;

/**
 *
 * @author guest1Day
 * 🔶文字の入れ替え
 * 文字列型の変数を宣言して，"きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます" をその値としてください。 
宣言した変数について，「I」を「い」に，「U」を「う」に置換した文字列を表示してください。
 */
public class output37 {
    public static void main(String[] agre){
        String mozi="きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます";
        
        System.out.print(mozi.replace("U", "う").replace("I", "い"));
    }
}
