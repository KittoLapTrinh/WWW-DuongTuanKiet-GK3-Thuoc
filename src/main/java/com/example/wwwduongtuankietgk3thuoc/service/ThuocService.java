package com.example.wwwduongtuankietgk3thuoc.service;

import com.example.wwwduongtuankietgk3thuoc.models.Thuoc;

import java.util.List;

public interface ThuocService {
    // Lấy danh sách tất cả các thuốc
    List<Thuoc> getAllThuoc();
    List<Thuoc> getThuocByLoai(long maLoai);
    boolean insert(Thuoc thuoc);
    Thuoc getThuocDetail(long maThuoc) throws Exception;

}
