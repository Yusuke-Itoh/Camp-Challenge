/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hyouzyunClass;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author maimaimai
 */
@WebServlet(name = "ouyouKadai", urlPatterns = {"/ouyouKadai"})
public class ouyouKadai extends HttpServlet {
    

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
        
        
        

        File txt = new File("C:\\Users\\maimaimai\\Documents\\NetBeansProjects\\Camp\\src\\java\\hyouzyunClass\\Logfile.txt");
        FileWriter fw = new FileWriter(txt);
        BufferedWriter bw = new BufferedWriter(fw);
        FileReader fr = new FileReader(txt);
        BufferedReader br = new BufferedReader(fr);
        
        Date d = new Date();
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = f.format(d);
        
        
        bw.write(s + "処理を開始します");
              bw.newLine();   
              
        int num1 = -8;
        double num2 =16;
        double circle;
        circle = num2 * num2 * Math.PI;
        
        bw.write("負の数x=" + num1 + "<br>");
              bw.newLine();
        bw.write("xの絶対値=" + Math.abs(num1) + "<br>");
              bw.newLine();
        bw.write("円の半径=" + num2 + "<br>");
              bw.newLine();
        bw.write("円の面積(circle)=" + circle + "<br>");
              bw.newLine();
        bw.write(s + "処理は完了です");
        bw.close();
        
        
        
        
        
        
        
        
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ouyouKadai</title>");            
            out.println("</head>");
            out.println("<body>");
            

            String str;
        while((str = br.readLine()) != null){
            out.print(str + "<br>");
        }   
            fw.close();

            
            
            
            out.println("</body>");
            out.println("</html>");
        } finally {
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
