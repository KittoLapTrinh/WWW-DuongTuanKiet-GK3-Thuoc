<%@ page import="com.example.wwwduongtuankietgk3thuoc.models.Thuoc" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.wwwduongtuankietgk3thuoc.models.LoaiThuoc" %><%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 10/26/2024
  Time: 11:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>List Thuoc</h1> <br>
    <table border="1">
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
            <td><%=t.getLoaiThuoc().getMaLoai()%></td>
        </tr>
        <%
            }
        %>
        </tbody>
    </table>
    <br>
    <form method="post" action="page?action=insertThuoc">
        <label for="tenThuoc">Ten Thuoc:</label>
        <input type="text" id="tenThuoc" name="tenThuoc" required><br><br>

        <label for="gia">Gia Thuoc:</label>
        <input type="number" id="gia" name="gia"><br><br>

        <label for="namSX">Nam SX:</label>
        <input type="date" id="namSX" name="namSX" required><br><br>

        <label for="maLoai">Ma Loai:</label>
        <select id="maLoai" name="maLoai" required>
            <%
                List<LoaiThuoc> loaiThuocs = (List<LoaiThuoc>) request.getAttribute("loaiThuocs");
                for(LoaiThuoc lt: loaiThuocs){
            %>
            <option value="<%=lt.getMaLoai()%>"><%=lt.getTenLoai()%></option>
            <%
                }
            %>
        </select><br><br>

        <button type="submit">Submit</button>
    </form>

</body>
</html>
