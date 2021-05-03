<%-- 
    Document   : FristApi
    Created on : May 3, 2021, 5:48:06 PM
    Author     : chakk
--%>

<%@page import="org.json.JSONArray"%>
<%@page import="org.json.JSONObject"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>ตารางรายได้จากการท่องเที่ยว จำแนกรายจังหวัด</h2>
       <%  String x = (String)request.getAttribute("Api");
            JSONObject jkuy = new JSONObject(x);
            JSONObject bank = jkuy.getJSONObject("result");
            JSONArray jArrKuy = bank.getJSONArray("records");
        %>
        
        <table border="1">
     <thread>
          <tr>
            <th>id</th>
            <th>จังหวัด</th>
            <th>2555</th>
            <th>2556</th>
            <th>2557</th>
            <th>2558</th>
            <th>2559</th>
            <th>2560</th>
            
          </tr></thread>
          <%for (int i=0;i<jArrKuy.length();i++){%>
          <tr>
          <form name="AddToCart"action="AddToCart" method="POST">
              <td><%= jArrKuy .getJSONObject(i).getInt("_id") %></td>
              <td><%= jArrKuy .getJSONObject(i).getString("จังหวัด") %></td>
              <td><%= jArrKuy .getJSONObject(i).getInt("2555") %></td>
              <td><%= jArrKuy .getJSONObject(i).getInt("2556") %></td>
              <td><%= jArrKuy .getJSONObject(i).getInt("2557") %></td>
              <td><%= jArrKuy .getJSONObject(i).getInt("2558") %></td>
              <td><%= jArrKuy .getJSONObject(i).getInt("2559") %></td>
              <td><%= jArrKuy .getJSONObject(i).getInt("2560") %></td>
          </form>
          </tr>
          <%
               }
          %>
    </table>
    <br>
    <form name="AddToCart"action="index.html">
        <input type="submit" value="กลับสู่หน้าหลัก" name="ยืนยัน" />
    </form>
            
    </body>
</html>
