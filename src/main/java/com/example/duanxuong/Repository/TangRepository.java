package com.example.duanxuong.repository;

import com.example.duanxuong.model.Tang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TangRepository extends JpaRepository<Tang, UUID> {
}
