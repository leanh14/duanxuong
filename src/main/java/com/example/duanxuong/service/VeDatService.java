package com.example.duanxuong.service;

import com.example.duanxuong.model.VeDat;

import java.util.List;
import java.util.UUID;

public interface VeDatService {
    List<VeDat>getAll();
    void add(VeDat veDat);
    void delete(UUID id);
    VeDat detail(UUID id);
    VeDat update(UUID id,VeDat veDat);
}
