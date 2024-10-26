<%@ page import="com.example.wwwduongtuankietgk3thuoc.models.Thuoc" %><%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 10/26/2024
  Time: 11:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Detail</title>
</head>
<body>
  <h1>Detail</h1>
  <%
    Thuoc thuoc = (Thuoc) request.getAttribute("thuoc");
    StringBuilder listThuoc = new StringBuilder();
    for(Thuoc t: thuoc.getLoaiThuoc().getThuocs()){
      listThuoc.append(t);
    }
    System.out.println(listThuoc);
  %>
  <table border="1">
    <thead>
      <tr>
        <td>MA THUOC</td>
        <td><%=thuoc.getMaThuoc()%></td>
      </tr>
      <tr>
        <td>Ten</td>
        <td><%=thuoc.getTenThuoc()%></td>
      </tr>
      <tr>
        <td>Gia</td>
        <td><%=thuoc.getGia()%></td>
      </tr>
      <tr>
        <td>Nam SX</td>
        <td><%=thuoc.getNamSX()%></td>
      </tr>
      <tr>
        <td>List Thuoc</td>
        <td><%=thuoc.getLoaiThuoc().getMaLoai()%></td>
      </tr>
    </thead>
  </table>

</body>
</html>
