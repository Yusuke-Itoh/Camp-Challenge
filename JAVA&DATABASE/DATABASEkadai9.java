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
public class DATABASEkadai9 extends HttpServlet {

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
        String a1 = request.getParameter("ID");
        String a2 = request.getParameter("name");
        String a3 = request.getParameter("tell");
        String a4 = request.getParameter("age");
        String a5 = request.getParameter("birthday");
        
        int i1= Integer.valueOf(a1);
        int i2= Integer.valueOf(a4);

    
        Connection db_con = null;
        PreparedStatement db_st = null;
        ResultSet db_data = null;
        


                
        try {        
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con =DriverManager.getConnection("jdbc:mysql://localhost:3306/challenge_db","azuki","aiueo");
            
            db_st = db_con.prepareStatement("insert into profiles values(?,?,?,?,?)");
            db_st.setInt(1,i1);
            db_st.setString(2,a2);
            db_st.setString(3,a3);
            db_st.setInt(4,i2);
            db_st.setString(5,a5);
            db_st.executeUpdate();
            
            
                      
            db_st = db_con.prepareStatement("select * from profiles");
            db_data=db_st.executeQuery();
            
            while(db_data.next()){
                out.print("ID:" + db_data.getString("profilesID") +"名前:" + db_data.getString("name") 
                        + "電話番号：" + db_data.getString("tell") + "年齢:" + db_data.getString("age") 
                        + "誕生日:" + db_data.getString("birthday") +"<br>");
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
