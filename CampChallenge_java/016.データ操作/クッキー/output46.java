/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kadai12;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import javax.servlet.http.Cookie;

/**
 *
 * @author guest1Day
 */
public class output46 extends HttpServlet {

    /**
     * 🔶クッキーの記録と表示
     * クッキーを利用して現在時刻を記録してください。
     * また，２回目以降のアクセス時は，クッキーの値を取り出し，前回にアクセスした時刻の情報を画面に表示してください
     */
    
    
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            Date nowtime =new Date();//現時刻の作成
            SimpleDateFormat time= new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒LLにログイン");//時刻の値作成
           String T= time.format(nowtime);//現時刻の値を作成
           String ECDate = URLEncoder.encode(T, "UTF-8");//日本語なのでエンコード作成
            Cookie c= new Cookie("Data",ECDate);//クッキーの値作成。
            
            response.addCookie(c);//反映
            Cookie[] cs = request.getCookies();//取得
            
             if (cs != null) {//中身があった場合に出力
                for (int i = 0; i < cs.length; i++){
                    if (cs[i].getName().equals("Data")) {
                        String Cdate=cs[i].getValue();
                        
                        String DCDate =URLDecoder.decode(Cdate,"UTF-8");//デーコード作成
                        out.print(DCDate);
                        break;
                        }
                    }
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
