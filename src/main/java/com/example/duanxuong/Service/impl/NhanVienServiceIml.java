package com.example.duanxuong.Service.impl;

import com.example.duanxuong.Model.NhanVien;
import com.example.duanxuong.Repository.NhanVienRepository;
import com.example.duanxuong.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class NhanVienServiceIml implements NhanVienService {
    @Autowired
    NhanVienRepository nhanVienRepository;


    @Override
    public List<NhanVien> getAll() {
        return nhanVienRepository.findAll();
    }

    @Override
    public void add(NhanVien nhanVien) {
        nhanVienRepository.save(nhanVien);

    }

    @Override
    public void delete(UUID id) {
        nhanVienRepository.deleteById(id);

    }

    @Override
    public NhanVien detail(UUID id) {
        NhanVien nhanVien = nhanVienRepository.findById(id).get();
        return nhanVien;
    }

    @Override
    public NhanVien update( UUID id,NhanVien nhanVien) {
        NhanVien nhanVien1 = nhanVienRepository.save(nhanVien);
        return nhanVien1;
    }
}