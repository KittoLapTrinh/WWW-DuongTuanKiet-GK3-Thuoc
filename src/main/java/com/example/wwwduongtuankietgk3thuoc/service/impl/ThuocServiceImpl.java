package com.example.wwwduongtuankietgk3thuoc.service.impl;

import com.example.wwwduongtuankietgk3thuoc.models.Thuoc;
import com.example.wwwduongtuankietgk3thuoc.repositories.ThuocRepository;
import com.example.wwwduongtuankietgk3thuoc.service.ThuocService;

import java.util.List;

public class ThuocServiceImpl implements ThuocService {
    private final ThuocRepository repository;

    public ThuocServiceImpl() {
        repository = new ThuocRepository();
    }
    @Override
    public List<Thuoc> getAllThuoc() {
        return repository.getAll(Thuoc.class);
    }

    @Override
    public List<Thuoc> getThuocByLoai(long maLoai) {
        return repository.getThuocByLoai(maLoai);
    }

    @Override
    public boolean insert(Thuoc thuoc) {
        return repository.insert(thuoc);
    }
}
