package com.example.wwwduongtuankietgk3thuoc.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "loaithuoc")
public class LoaiThuoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long maLoai;
    private String tenLoai;

    @OneToMany(mappedBy = "loaiThuoc", cascade = CascadeType.ALL)
    private List<Thuoc> thuocs;

    public LoaiThuoc(String tenLoai, List<Thuoc> thuocs) {
        this.tenLoai = tenLoai;
        this.thuocs = thuocs;
    }

    public LoaiThuoc(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public LoaiThuoc() {
    }

    public long getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(long maLoai) {
        this.maLoai = maLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public void setThuocs(List<Thuoc> thuocs) {
        this.thuocs = thuocs;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public List<Thuoc> getThuocs() {
        return thuocs;
    }

    @Override
    public String toString() {
        return "LoaiThuoc{" +
                "maLoai=" + maLoai +
                ", tenLoai='" + tenLoai + '\'' +
                ", thuocs=" + thuocs +
                '}';
    }
}
