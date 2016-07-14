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
public class DATABASEouyou3 extends HttpServlet {

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
        PrintWriter out = response.getWriter();       Connection db_con = null;
        PreparedStatement db_st = null;
        ResultSet db_data = null;
        
        
        
        try {
          Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con =DriverManager.getConnection("jdbc:mysql://localhost:3306/challenge_db","azuki","aiueo");
            
            db_st = db_con.prepareStatement("select * from productinfo");
            db_data=db_st.executeQuery();
            
            while(db_data.next()){
                out.print("ID:" + db_data.getString("productID") +"商品名:" + db_data.getString("name") 
                        + "価格:" + db_data.getString("price") + "在庫:" + db_data.getString("stock") +"<br>");
            }
            
            
            db_data.close();
            db_st.close();
            db_con.close();
            
            out.println("<br><a href=\"DATABASEouyou_productMng.jsp\">前の画面に戻る</a>");
            
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
