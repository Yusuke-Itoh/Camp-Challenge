/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack;

import java.util.ArrayList;

/**
 *
 * @author maimaimai
 */
public class User extends Human{

@Override
public boolean checkSum(ArrayList<Integer> mycard){
//手札確認。もし1があって、かつその時、11点以下だったら１は１１として扱う。
//ディーラーは16点以上でなければ、hitしなければいけない。
        for(int i=0;i<mycard.size();i++){
            if(mycard.get(i)==1 && open(mycard)<=11){
                     mycard.set(i,11);
            }
        }
    if(open(mycard)<=17){
        return true;
    }else{
        return false;
    }

        
}

@Override
public int open(ArrayList<Integer> mycard){
    int a=0;
    for(int i=0;i<mycard.size();i++){
        a += mycard.get(i);
    }
    return a;
    
}

@Override
public void setCard(ArrayList<Integer> mycard){
   Dealer d = new Dealer();
          d.deal(mycard);
   while(this.checkSum(mycard)){
          d.hit(mycard);
    
    

   }
  }
}
