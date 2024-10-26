package com.example.wwwduongtuankietgk3thuoc.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "thuoc")
@NamedQueries({
        @NamedQuery(name = "thuoc.getAll", query = "select t from Thuoc t"),
        @NamedQuery(name = "thuoc.getThuocByLoai", query = "select t from Thuoc t inner join t.loaiThuoc lt where lt.maLoai =: maLoai")
})
public class Thuoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long maThuoc;
    private String tenThuoc;
    private double gia;
    private LocalDate namSX;
    @ManyToOne
    @JoinColumn(name = "maLoai")
    private LoaiThuoc loaiThuoc;



    public Thuoc() {
    }

    public Thuoc(String tenThuoc, double gia, LocalDate namSX, LoaiThuoc loaiThuoc) {
        this.tenThuoc = tenThuoc;
        this.gia = gia;
        this.namSX = namSX;
        this.loaiThuoc = loaiThuoc;
    }

    public long getMaThuoc() {
        return maThuoc;
    }

    public String getTenThuoc() {
        return tenThuoc;
    }

    public double getGia() {
        return gia;
    }

    public LocalDate getNamSX() {
        return namSX;
    }

    public LoaiThuoc getLoaiThuoc() {
        return loaiThuoc;
    }

    public void setMaThuoc(long maThuoc) {
        this.maThuoc = maThuoc;
    }

    public void setTenThuoc(String tenThuoc) {
        this.tenThuoc = tenThuoc;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public void setLoaiThuoc(LoaiThuoc loaiThuoc) {
        this.loaiThuoc = loaiThuoc;
    }

    public void setNamSX(LocalDate namSX) {
        this.namSX = namSX;
    }

    @Override
    public String toString() {
        return "Thuoc{" +
                "maThuoc=" + maThuoc +
                ", tenThuoc='" + tenThuoc + '\'' +
                ", gia=" + gia +
                ", namSX=" + namSX +
                ", loaiThuoc=" + loaiThuoc +
                '}';
    }
}
