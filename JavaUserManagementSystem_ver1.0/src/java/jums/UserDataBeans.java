//課題３


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jums;
import java.io.Serializable;
import java.util.ArrayList;
//フォームから受け取ったデータ自体を格納するJavaBeansにする。
public class UserDataBeans implements Serializable {
    
    private int userID=0;
    private String name;
    //年月日に変える
    private int year;
    private int month;
    private int day;
    //birthdayじゃなくて数値の
    //
    private String tell;
    private int type;
    private String comment;
    
 public UserDataBeans(){
        userID=0;
        name="";
    //年月日に変える
        year=0;
        month=0;
        day=0;
    //birthdayじゃなくて数値に
        tell="";
        type=1;
        comment="";
    }
    
    
    public int getUserID() {
        return userID;
    }
    public void setUserID(int userID) {
        this.userID = userID;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
//課題３
//yearとmonthも作る    
    public int getYear(){
        return this.year;
    }
    
    public void setYear(String year){
        if(!year.equals("")){
        this.year =Integer.parseInt(year);
        }else{
        this.year = 0;    
        }
    }
    
    public int getMonth(){
        return this.month;
    }
    
    public void setMonth(String month){
             if(!month.equals("")){
        this.month =Integer.parseInt(month);
        }else{
        this.month = 0;    
        }
    }
    
    public int getDay(){
        return this.day;
    }
    public void setDay(String day){
     if(!day.equals("")){
        this.day =Integer.parseInt(day);
        }else{
        this.day = 0;    
        }
    }
    
    public String getTell(){
        return tell;
    }
    public void setTell(String tell){
        this.tell = tell;
    }
    
    public int getType(){
        return type;
    }
    public void setType(String type){
        this.type = Integer.parseInt(type);
    }
    
    public String getComment(){
        return comment;
    }
    public void setComment(String comment){
        this.comment = comment;
    }

}
