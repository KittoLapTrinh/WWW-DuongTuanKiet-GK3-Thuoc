package com.example.wwwduongtuankietgk3thuoc;

import com.example.wwwduongtuankietgk3thuoc.models.LoaiThuoc;
import com.example.wwwduongtuankietgk3thuoc.models.Thuoc;
import com.example.wwwduongtuankietgk3thuoc.service.LoaiThuocService;
import com.example.wwwduongtuankietgk3thuoc.service.ThuocService;
import com.example.wwwduongtuankietgk3thuoc.service.impl.LoaiThuocServiceImpl;
import com.example.wwwduongtuankietgk3thuoc.service.impl.ThuocServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "pageServlet", value = "/page")
public class QuanLyThuocServlet extends HttpServlet {
    private String message;
    public void init(){
        message = "Hello World";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        try{
            String action = req.getParameter("action");
            if(action == null){
                PrintWriter out = resp.getWriter();
                out.println("<html><body>");
                out.println("<h1>" + message + "</h1>");
                out.println("</body></html>");
                return;
            }
            switch (action){
                case "home":{
                    PrintWriter out = resp.getWriter();
                    out.println("<html><body>");
                    out.println("<h1>" + message + "</h1>");
                    out.println("</body></html>");
                }
                case "loaiThuoc":
                    handleActionLoaiThuoc(req, resp);
                    break;
                case "thuoc":
                    handleActionThuoc(req, resp);
                    break;
                case "detail-loaiThuoc":
                    handleActionLoaiThuocDetail(req, resp);
                    break;
                case "insertThuoc":
                    handleInsertThuoc(req, resp);
                    break;
                case "getThuocByLoai":
                    handleGetThuocByLoai(req, resp);
                    break;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private void handleActionThuoc(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ThuocService service = new ThuocServiceImpl();
        List<Thuoc> thuocs = service.getAllThuoc();
        req.setAttribute("thuocs", thuocs);
        String page = "thuoc/thuoc.jsp";
        forwardToPage(page, req, resp);
    }

    private void handleGetThuocByLoai(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void handleInsertThuoc(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void handleActionLoaiThuocDetail(HttpServletRequest req, HttpServletResponse resp) {
        long loaiThuoc = Long.parseLong(req.getParameter("loaiThuoc"));
        LoaiThuocService service = new LoaiThuocServiceImpl();
//        LoaiThuoc loaithuoc = service.getLoaiThuoc
    }

    private void handleActionLoaiThuoc(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LoaiThuocService service = new LoaiThuocServiceImpl();
        List<LoaiThuoc> loaiThuocs = service.getAllLoaiThuoc();
        req.setAttribute("loaiThuocs", loaiThuocs);
        String page = "loaithuoc/loaiThuoc.jsp";
        forwardToPage(page, req, resp);
    }

    private void forwardToPage(String page, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher(page).include(req, resp);
    }

    public void destroy(){

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
