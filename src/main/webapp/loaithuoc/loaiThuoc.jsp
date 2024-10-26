<%@ page import="com.example.wwwduongtuankietgk3thuoc.models.LoaiThuoc" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 10/26/2024
  Time: 9:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Loai Thuoc</title>
</head>
<body>
    <h1>Loai Thuoc</h1>
    <table border="1">
        <thead>
            <tr>
                <th>MA THUOC</th>
                <th>TEN LOAI</th>
                <th>LIST THUOC</th>
            </tr>
        </thead>
        <tbody>
           <%
            List<LoaiThuoc> loaiThuocs = (List<LoaiThuoc>) request.getAttribute("loaiThuocs");
            int i = 1;
            for(LoaiThuoc lt: loaiThuocs) {
           %>
               <tr>
                   <td><%=lt.getMaLoai()%></td>
                   <td><%=lt.getTenLoai()%></td>
                   <td><a href="page?action=detail-loaiThuoc&id=<%=lt.getMaLoai()%>">See Detail</a> </td>
               </tr>
           <%
            }
           %>
        </tbody>
    </table>

</body>
</html>
