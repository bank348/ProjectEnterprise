/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONObject;

/**
 *
 * @author chakk
 */
@WebServlet(name = "Api2", urlPatterns = {"/Api2"})
public class Api2 extends HttpServlet {

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
        try {
            URL url = new URL("https://opend.data.go.th/opend-search/vir_3875_1594274328/query?dsname=vir_3875_1594274328&path=vir_3875_1594274328&path=vir_3875_1594274328&loadAll=1&type=json&limit=100&offset=0");
            HttpURLConnection httpURLConnection=(HttpURLConnection)url.openConnection();
            httpURLConnection.setRequestMethod("GET");

            //adding header
            httpURLConnection.setRequestProperty("api-key","8yXV9er7HvOZyMBaJpNCtc5tjXi9afFW");

            String line="";
            InputStreamReader inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8");;
            BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
            StringBuilder hello=new StringBuilder();
            while ((line=bufferedReader.readLine())!=null){
                hello.append(line);
            }   
            bufferedReader.close();
           // httpURLConnection.setRequestProperty("type", "json");
  
            JSONObject jsonArray =new JSONObject(hello.toString());
            System.out.print(jsonArray);
            request.setAttribute("Api", jsonArray.toString());
            request.getRequestDispatcher("SecondApi.jsp").forward(request, response);
        }  
        catch (Exception e){
           // System.out.println("Error in Making Get Request");
            request.setAttribute("Api","Error in Making Get Request");
            request.getRequestDispatcher("SecondApi.jsp").forward(request, response);
              
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
