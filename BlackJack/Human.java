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
public abstract class Human {
   public abstract int open(ArrayList<Integer> mycard);
   public abstract void setCard(ArrayList<Integer> mycard);
   public abstract boolean checkSum(ArrayList<Integer> mycard);
   ArrayList<Integer> myCards = new ArrayList<Integer>();


    
}
