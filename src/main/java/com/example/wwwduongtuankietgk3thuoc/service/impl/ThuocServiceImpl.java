package com.example.wwwduongtuankietgk3thuoc.service.impl;

import com.example.wwwduongtuankietgk3thuoc.models.Thuoc;
import com.example.wwwduongtuankietgk3thuoc.repositories.ThuocRepository;
import com.example.wwwduongtuankietgk3thuoc.service.ThuocService;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Thuoc getThuocDetail(long maThuoc) throws Exception {
        Optional<Thuoc> thuoc = repository.get(Thuoc.class, maThuoc);
        if(thuoc.isEmpty())
            throw new Exception("Not fund");
        return thuoc.get();
    }
}
