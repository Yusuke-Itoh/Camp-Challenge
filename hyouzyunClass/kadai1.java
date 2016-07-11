/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hyouzyunClass;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
@WebServlet(name = "kadai1", urlPatterns = {"/kadai1"})
public class kadai1 extends HttpServlet {

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
        
        
    Calendar c = Calendar.getInstance();
    c.set(2016,1,1,0,0,0);
    Date cpast = c.getTime();
        
    Date d = new Date();
    SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String s = f.format(d);
    
    
    Calendar cal = Calendar.getInstance();
    cal.set(2016,11,4,10,0,0);
    Date calpast = cal.getTime();
    int yearA = cal.get(Calendar.YEAR);
    int monthA = cal.get(Calendar.MONTH);
    int dayA = cal.get(Calendar.DAY_OF_MONTH);
    int hourA = cal.get(Calendar.HOUR);
    int minA = cal.get(Calendar.MINUTE);
    int secA = cal.get(Calendar.SECOND);
        
    Calendar ccc = Calendar.getInstance();
    ccc.set(2016,12,31,23,59,59);
    Date cccpast = ccc.getTime();
    int yearB = ccc.get(Calendar.YEAR);
    int monthB = ccc.get(Calendar.MONTH);
    int dayB = ccc.get(Calendar.DAY_OF_MONTH);
    int hourB = ccc.get(Calendar.HOUR);
    int minB = ccc.get(Calendar.MINUTE);
    int secB = ccc.get(Calendar.SECOND);    
       long abc;abc = cccpast.getTime() - cpast.getTime();
    
    String name = "伊藤友亮";
    String bubun ="az.gen.yu@gmail.com";
    String oki = "「きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます」";
    oki=oki.replace("I", "い");
    oki=oki.replace("U", "う");
        
    File txt = new File("C:\\Users\\maimaimai\\Documents\\NetBeansProjects\\Camp\\src\\java\\hyouzyunClass\\file.txt");
    FileReader fr = new FileReader(txt);
    BufferedReader br = new BufferedReader(fr);


    
        
        
        
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet kadai1</title>");            
            out.println("</head>");
            out.println("<body>");
        //課題１
            out.print(cpast.getTime() + "<br>");
            
        //課題２
            out.println(s + "<br>");
        //課題３
            out.println(calpast.getTime() + "<br>");
            out.println(yearA + "-" + monthA + "-" + dayA);
            out.print(hourA + ":" + minA + ":" + secA + "<br>");
        //課題４
            out.print(abc + "<br>");
        //課題５
            out.print(name.getBytes().length + "<br>");
            out.print(name.length() + "<br>");
        //課題６
            out.print(bubun.substring(bubun.indexOf("@")) + "<br>");
        //課題７
            out.print(oki + "<br>");
        //課題８
            String str;
        while((str = br.readLine()) != null){
            out.print(str + "<br>");
        }


            br.close();
            
            
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
