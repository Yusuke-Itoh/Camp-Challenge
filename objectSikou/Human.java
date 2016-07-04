/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object.Test;

import java.io.PrintWriter;

/**
 *
 * @author maimaimai
 */
   public class Human{
     public String name = "";
     public Integer age = 0;
     
     public void set(){
         this.name="aaa";
         this.age=20;
     }
     public void print(PrintWriter out){
         out.print(this.name);
         out.print(this.age);
     }

}