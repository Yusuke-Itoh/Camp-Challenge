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
@WebServlet(name = "kadaiServlet2", urlPatterns = {"/kadaiServlet2"})
public class kadaiServlet2 extends HttpServlet {

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
        try {
            
 //課題7
        nArr2(out);
  
  
  
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet kadaiServlet2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet kadaiServlet2 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }
    
    protected String[] nArr2(int idnum){
        String[] Array1 ={"ID:1","一条はじめ","1992/06/02","東京都渋谷区"};
        String[] Array2 ={"ID:2","二条なかや","1982/03/03",null};
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
//課題７  
    protected void nArr2(PrintWriter out){
        for(int num = 1;num<4;num++){
                for(int i = 1;i<4;i++){
                    if(nArr2(num)[i] == null){
                           continue;}
                        out.print(nArr2(num)[i] + "<br>");
                     
                    
                }
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
