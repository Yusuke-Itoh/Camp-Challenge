/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack;

import java.util.Random;
import java.util.ArrayList;


/**
 *
 * @author maimaimai
 */
public class Dealer extends Human{
    
    static ArrayList<Integer> cards = new ArrayList<Integer>(); 
    
  Dealer(){
//山札の用意。52枚のカード。
       
    
//２～１０までのカードを４組用意する
    for(int i=0;i<4;i++){
        for(int j=2;j<=10;j++){
            cards.add(j);    
        }
    }        
//絵札も４組作る
    for(int k=0;k<4;k++){
//ACE,Jack,Queen,King
        cards.add(1);
        cards.add(10);
        cards.add(10);
        cards.add(10);       
  }
//トランプの山札作成完了
}    
  
    
   public void deal(ArrayList<Integer> mycard){
//カードを二枚山札から引く。手札。
//ランダムにカードを二枚引く動き。乱数を用意する
        Random rand = new Random();
            for(int i = 0;i<2;i++){
            int index = rand.nextInt(cards.size());
//2枚ドローする
                mycard.add(cards.get(index)); 
                cards.remove(index);
//引いた分山札から2枚除く 

       
   }
   
}


public void hit(ArrayList<Integer> mycard){
//カードを一枚山札から引く。
    Random rand = new Random();
        int index = rand.nextInt(cards.size());
            mycard.add(cards.get(index));
            cards.remove(index);


}
    
    
    @Override
    public boolean checkSum(ArrayList<Integer> mycard){
//手札確認。もし1があって、かつその時、11点以下だったら１は１１として扱う。
//ディーラーは16点以上でなければ、hitしなければいけない。
        for(int i=0;i<mycard.size();i++){
            if(mycard.get(i)==1 && open(mycard)<=11){
                     mycard.set(i,11);
            }
        }
    if(open(mycard)<=16){
        return true;
    }else{
        return false;
    }

        
}
    
    
    
        @Override
        public void setCard(ArrayList<Integer> mycard){
        this.deal(mycard);
        while(this.checkSum(mycard)){
           this.hit(mycard);
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
}