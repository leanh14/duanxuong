package com.example.duanxuong.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;
@Entity
@Table(name = "Tang")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Tang {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;
    @Column(name = "ma")
    private String maTang;
    @Column(name = "tenTang")
    private String tenTang;
    @Column(name = "soPhong")
    private Integer soPhong;
}
