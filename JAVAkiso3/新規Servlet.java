/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.sample;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author maimaimai
 */
@WebServlet(name = "新規Servlet", urlPatterns = {"/__Servlet"})
public class 新規Servlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        //ユーザー定義メソッド

        try {
//課題１
   for(int i = 0;i < 10; i++){
   hello(out);
}
//課題４
   boolean sadou = hello(out);
   if(sadou = true){
       out.print("この処理は正しく実行できました" + "<br>");
   }else if(sadou = false){
       out.print("正しく実行できませんでした" + "<br>");
   }

//課題２
  add(45);
  out.print("45は" + add(45) + "<br>");

//課題３
  add2(5,out);
  
//課題５
  out.print(nArr()[1] + "<br>");
  out.print(nArr()[2] + "<br>");
  out.print(nArr()[3] + "<br>");
  
//課題６
  nArr2(3);
  out.print(nArr2(3)[1] + "<br>");
  out.print(nArr2(3)[2] + "<br>");
  out.print(nArr2(3)[3] + "<br>");

//メソッドを呼び出す



            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet 新規Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println(" ");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }
     protected boolean hello(PrintWriter out){
   out.print("伊藤友亮" +"<br>");
//名前
   out.print("1990/7/25" + "<br>");
//生年月日
   out.print("よろしくお願いします" + "<br>");
//自己紹介
   boolean kensa = true;
   return kensa;
}
     
     
     protected String add(int x){
         String ans = " ";         
         if(x % 2 == 0){
                ans ="偶数";
         }   
         if(x % 2 == 1){
                ans ="奇数";      
         }
         return ans;
     }
    void add2(int a,PrintWriter out){
        int b = 5;
        boolean type = false;
        add2(a,b,type,out);
    }
     
    protected int add2(int a,int b,boolean type,PrintWriter out){
        int ans2 = a * b;
        if(type == true){
            ans2 = ans2 * ans2;
            out.print(ans2 + "<br>");
        }else{
           out.print(ans2 + "<br>");
        }
        return ans2;
        }
    
    
    protected String[] nArr(){
        String[] newArray ={"ID:83","山田太郎","1987/05/22","東京都新宿区"};
        return newArray;     
    }
 
    protected String[] nArr2(int idnum){
    String[] Array1 ={"ID:1","一条はじめ","1992/06/02","東京都渋谷区"};
    String[] Array2 ={"ID:2","二条なかや","1982/03/03","神奈川県川崎市"};
    String[] Array3 ={"ID:3","三条おわり","1997/12/24","千葉県千葉市"};
       
        switch(idnum){
            case 1: 
                return Array1;
            case 2:
                return Array2;
            case 3:
                return Array3;
            default:
                return null;          
    }
    }
    
       

     
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
