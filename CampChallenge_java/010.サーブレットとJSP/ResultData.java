/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.sample;

import java.io.Serializable; //1.java.io.Serializableインターフェイスを実装する。
import java.util.Date;

/**
 *
 * @author guest1Day
 */
public class ResultData implements Serializable {
    //2.フィールドは、カプセル化する。
    private Date d;
    private String luck;
    //3.Publicで引数の無いコンストラクタを持つ。//
    public  ResultData() {}
    
    public Date getD(){
        return d;}
    
    public void setD(Date d){
        this.d= d;}
    
   public String getLuck(){
       return luck;}
   
   public void setLuck(String luck){
        this.luck=luck;}
   
}