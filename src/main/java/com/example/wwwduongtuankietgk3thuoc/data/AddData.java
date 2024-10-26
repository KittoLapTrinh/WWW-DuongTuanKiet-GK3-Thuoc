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



    }
}
