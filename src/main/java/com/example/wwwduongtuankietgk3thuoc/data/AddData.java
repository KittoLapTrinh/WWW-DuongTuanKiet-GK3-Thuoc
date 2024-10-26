package com.example.wwwduongtuankietgk3thuoc.data;

import com.example.wwwduongtuankietgk3thuoc.models.LoaiThuoc;
import com.example.wwwduongtuankietgk3thuoc.models.Thuoc;
import com.example.wwwduongtuankietgk3thuoc.repositories.LoaiThuocRepository;
import com.example.wwwduongtuankietgk3thuoc.repositories.ThuocRepository;

import java.time.LocalDate;
import java.util.List;

public class AddData {
    public static void main(String[] args) {
        LoaiThuoc l1 = new LoaiThuoc("Thuoc Cam", null);
        Thuoc t1 = new Thuoc("Panadol",5000, LocalDate.of(2024, 1, 1), l1);
        Thuoc t2 = new Thuoc("Aspirin",3000,LocalDate.of(2023, 2, 1), l1);
        Thuoc t3 = new Thuoc("Ibuprofen",8000,LocalDate.of(2022, 10, 1), l1);

        List<Thuoc> thuocs = List.of(t1, t2, t3);
        l1.setThuocs(thuocs);
        LoaiThuocRepository loaiThuocRepository = new LoaiThuocRepository();
        loaiThuocRepository.insert(l1);

//        LoaiThuoc l2 = new LoaiThuoc("Thuốc Đau Khớp", null);
//
//        // Tạo các thuốc thuộc loại "Thuốc Đau Khớp"
//        Thuoc t4 = new Thuoc("Diclofenac", 6000, LocalDate.of(2024, 3, 1), l2);
//        Thuoc t5 = new Thuoc("Naproxen", 7000, LocalDate.of(2024, 4, 1), l2);
//
//        // Danh sách thuốc "Thuốc Đau Khớp"
//        List<Thuoc> thuocs = List.of(t4, t5);
//        l2.setThuocs(thuocs);
//        LoaiThuocRepository loaiThuocRepository = new LoaiThuocRepository();
//        loaiThuocRepository.insert(l2);





    }
}
