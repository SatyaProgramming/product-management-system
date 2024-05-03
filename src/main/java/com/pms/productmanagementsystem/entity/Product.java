package com.pms.productmanagementsystem.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(length = 500)
    private String description;
    @Column(nullable = false)
    private Double price;
    @ManyToOne
    private Category categoryId;


    private LocalDateTime createdAt = null;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime updatedAt;
}
