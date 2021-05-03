<%-- 
    Document   : SecondApi
    Created on : May 3, 2021, 6:36:48 PM
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
        <h2>ตางรางสัดส่วนคนจน</h2>
        <%  String x= (String)request.getAttribute("Api");
            JSONObject y = new JSONObject(x);
            JSONArray jArrKuy = y.getJSONArray("data");
        %>
        
        <table border="1">
     <thread>
          <tr>
            <th>ลำดับ</th>
            <th>การศึกษาสูงสุด</th>
            <th>2556</th>
            <th>2557</th>
            <th>2558</th>
          </tr></thread>
          <%for (int i=0;i<jArrKuy.length();i++){%>
          <tr>
          <form name="AddToCart"action="AddToCart" method="POST">
              <td><%= jArrKuy .getJSONObject(i).getInt("ลำดับ") %></td>
              <td><%= jArrKuy .getJSONObject(i).getString("การศึกษาสูงสุด") %></td>
              <td><%= jArrKuy .getJSONObject(i).getString("2556") %></td>
              <td><%= jArrKuy .getJSONObject(i).getString("2557") %></td>
              <td><%= jArrKuy .getJSONObject(i).getString("2558") %></td>
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
