package com.example.duanxuong.repository;


import com.example.duanxuong.model.Phim;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface PhimRepository  extends JpaRepository<Phim, UUID> {
    @Query(value = "select * from Phim ", nativeQuery = true)
    List<Phim> getAllPhim();
    Page<Phim> findByTenContaining(String ten, Pageable pageable);
}
