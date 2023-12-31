package com.example.duanxuong.repository;

import com.example.duanxuong.model.NhanVien;
import com.example.duanxuong.model.Voucher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface VoucherRepository extends JpaRepository<Voucher, UUID> {
    @Query(value = "select * from Voucher",nativeQuery = true)
    List<Voucher> getAll();
    List<Voucher> findByMa(String ma);
}
