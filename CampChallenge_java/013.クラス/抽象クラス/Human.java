/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kadai8;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author guest1Day
 */
public abstract class  Human{ //抽象クラス
    abstract public int open();//カードの合計を処理して返す
    abstract public void setCard(ArrayList<Integer> num);//カードを手札としてセットする処理
    abstract public boolean checkSum();    //合計値でヒットするかスタンドするかの処理
    ArrayList<Integer> myCards = new ArrayList<>();//,手札の管理
}
class Dealer extends Human{
    //初期値でcardsにすべてのカードを入れる
     ArrayList<Integer> cards = new ArrayList<>();
     //コンストラクタ
     Dealer(){
         for( int Ctype=1; Ctype<=4;Ctype++){ 
             for(int Cnum=1;Cnum<=13;Cnum++){
                 cards.add(Cnum);
             }
         }
         this.myCards=new ArrayList<Integer>();//ArrayaListの使用の仕方
                  
         
          /* 二重for文を使用する
          //4回回る
          for(){
            //13回まわる
            for(){
                //山札を格納
            }
          
          }                   
          */
     }
    public ArrayList<Integer> deal(){
        ArrayList<Integer> cards01 = new ArrayList<Integer>(); //cardsからランダムで2枚のカードをArrayListにして返却
        Random rand = new Random();
        Integer index01 = rand.nextInt(cards.size());//1枚目
        cards01.add(cards.get(index01));
        cards.remove(index01);//引いたカードを山札からなくす処理
        Integer index02 = rand.nextInt(cards.size());//2枚目
        cards01.add(cards.get(index02));
        cards.remove(index02);//引いたカードを山札からなくす処理
        return cards01;
    }
    public ArrayList<Integer> hit(){
        ArrayList<Integer> cards02 = new ArrayList<Integer>();//cardsからランダムで1枚のカードをArrayListにして返却してください。
        Random rand = new Random();
        Integer index = rand.nextInt(cards.size());//1枚目
        cards02.add(cards.get(index));
        cards.remove(index);//引いたカードを山札からなくす処理
        return cards02;
        }
    public void setCard(ArrayList<Integer> num){//Dealerにカードを（myCards）セットする処理
          for(Integer nakami:num){            //拡張for文
          this.myCards.add(nakami);
      }
    }
    public boolean checkSum(){           //16以下でもう一枚引く
        int total=open();
         
         if(total<17){
             return true;                 //もう一枚引く
         }else{
              return false;               //すたんど
         }
    }
    public int open(){
         int total=0;
         for(Integer Ctotal:this.myCards){
             total=total+Ctotal;
         }
         return total;
         }
     }


    class User extends Human{
    public void setCard(ArrayList<Integer> num){//Userにカードを（myCards）セットする処理
      for(Integer nakami:num){             //拡張for文
          this.myCards.add(nakami);
      }
    }
    public boolean checkSum(){           //16以下でもう一枚引く
        int total=open();
        
         
        if(total<16){
             return true;                 //もう一枚引く
         }else{
              return false;                //すたんど
         }
    }
     public int open(){
         int total=0;
         for(Integer Ctotal:myCards){
             total=total+Ctotal;
         }
         return total;
         }
     }