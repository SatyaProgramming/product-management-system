package com.pms.productmanagementsystem.repo;

import com.pms.productmanagementsystem.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long>{

}
