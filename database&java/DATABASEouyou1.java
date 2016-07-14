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
<<<<<<< 4966822af17f7a9c009dae0a17b67e107fc7ea2f
import javax.servlet.RequestDispatcher;
=======
>>>>>>> JAVAからのDBアクセス課題、修正版です

/**
 *
 * @author maimaimai
 */
public class DATABASEouyou1 extends HttpServlet {

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
        
        int a =0;
        String b ="";
        
        request.setCharacterEncoding("UTF-8");
        if(!request.getParameter("id").equals("")){
            a=Integer.parseInt(request.getParameter("id"));
        }
        if(!request.getParameter("pass").equals("")){
            b=request.getParameter("pass");
        }
        
        

        

        
        Connection db_con = null;
        PreparedStatement db_st = null;
        ResultSet db_data = null;
        
        try {    
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con =DriverManager.getConnection("jdbc:mysql://localhost:3306/challenge_db","azuki","aiueo");
            //IDとパスワードの照会
            String sql ="select * from userinfo where ID = ? and pass = ?"; 
            db_st = db_con.prepareStatement(sql);
            db_st.setInt(1,a);
            db_st.setString(2,b);
            db_data=db_st.executeQuery();
        //ここまで
        //IDとパスワードが見つかったら商品管理ページに飛ぶ
        //なかったらエラーページに飛ぶ
<<<<<<< 4966822af17f7a9c009dae0a17b67e107fc7ea2f
        String url = "";
        if (db_data.next()){
=======
            if (db_data.next()){
>>>>>>> JAVAからのDBアクセス課題、修正版です
            request.getRequestDispatcher("DATABASEouyou_productMng.jsp").forward(request,response);
        //ログイン処理
        //商品情報ページへ url = "/main.jsp";
         }else {
        //エラー処理
         out.print("ID、パスが不正です。");
         out.println("<a href=\"DATABASEouyou_login.jsp\">トップに戻る</a>");
            
 }
            db_data.close();
            db_st.close();
            db_con.close();
            
            
            
        }catch(SQLException e_sql){
            
            out.println("SQLエラー + <br> + 接続時にエラーが発生しました:" + e_sql.toString());
            
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
