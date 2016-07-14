/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATABASElink;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 *
 * @author maimaimai
 */
public class DATABASEouyou2 extends HttpServlet {

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
        request.setCharacterEncoding("UTF-8");
        
        int a1 = 0;
        String a2 = "";
        int a3 = 0;
        int a4 = 0;
        
        if(!request.getParameter("id").equals("")){
            a1 = Integer.parseInt(request.getParameter("id"));
        }
        if(!request.getParameter("name").equals("")){
            a2 = request.getParameter("name");
        }
         if(!request.getParameter("price").equals("")){
            a3=Integer.parseInt(request.getParameter("price"));
        }
        if(!request.getParameter("stock").equals("")){
            a4=Integer.parseInt(request.getParameter("stock"));
        }

        Connection db_con = null;
        PreparedStatement db_st = null;
        


                
        try {        
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con =DriverManager.getConnection("jdbc:mysql://localhost:3306/challenge_db","azuki","aiueo");
        if(a1 != 0 && !a2.equals("") && a3 != 0){
            
            
            db_st = db_con.prepareStatement("insert into productinfo values(?,?,?,?)");
            db_st.setInt(1,a1);
            db_st.setString(2,a2);
            db_st.setInt(3,a3);
            db_st.setInt(4,a4);
            db_st.executeUpdate();

           
            db_st.close();
            db_con.close();
            
            out.print("データが追加されました<br>");
            out.print("<a href=\"DATABASEouyou_productMng.jsp\">前の画面に戻る</a>");
        }else{
            out.print("データが不正です");
            out.print("<a href=\"DATABASEouyou_productMng.jsp\">前の画面に戻る</a>");
        }
            
            
        }catch(SQLException e_sql){
            
<<<<<<< 4966822af17f7a9c009dae0a17b67e107fc7ea2f
            out.println("SQLエラー + <br> + 接続時にエラーが発生しました:" + e_sql.toString());
=======
            out.println("SQLエラー<br>接続時にエラーが発生しました:" + e_sql.toString());
>>>>>>> JAVAからのDBアクセス課題、修正版です
            
        }catch(Exception e){
        
            out.println("接続時にエラーが発生しました:" + e.toString());
        } finally {
    
            if(db_con  != null)
                try
                {
                    db_con.close();
                    
                } catch (Exception e_con){
                    System.out.println(e_con.getMessage());
                            }     
            
            out.close();
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
