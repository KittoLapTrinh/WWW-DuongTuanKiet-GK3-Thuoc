<%@ page import="com.example.wwwduongtuankietgk3thuoc.models.Thuoc" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 10/26/2024
  Time: 9:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Thuoc</title>
</head>
<body>
    <h1>List Thuoc</h1> <br>
    <table>
        <thead>
            <tr>
                <th>MA THUOC</th>
                <th>TEN THUOC</th>
                <th>GIA</th>
                <th>NAM SX</th>
                <th>MA LOAI</th>
            </tr>
        </thead>
        <tbody>
            <%
                List<Thuoc> thuocs = (List<Thuoc>) request.getAttribute("thuocs");
                int i = 1;
                for(Thuoc t: thuocs){
            %>
            <tr>
                <td><%=t.getMaThuoc()%></td>
                <td><%=t.getTenThuoc()%></td>
                <td><%=t.getGia()%></td>
                <td><%=t.getNamSX()%></td>
                <td><%=t.getLoaiThuoc()%></td>
            </tr>
            <%
                }
            %>
        </tbody>
    </table>

</body>
</html>
