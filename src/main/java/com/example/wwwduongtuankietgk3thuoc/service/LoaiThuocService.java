package com.example.wwwduongtuankietgk3thuoc.service;

import com.example.wwwduongtuankietgk3thuoc.models.LoaiThuoc;

import java.util.List;
import java.util.Optional;

public interface LoaiThuocService {
    List<LoaiThuoc> getAllLoaiThuoc();

    boolean insert(LoaiThuoc loaiThuoc);

    Optional<LoaiThuoc> getLoaiThuocById(long maLoai);
}
