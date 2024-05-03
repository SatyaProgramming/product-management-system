package com.pms.productmanagementsystem.repo;

import com.pms.productmanagementsystem.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Calendar;

public interface CategoryRepo extends JpaRepository<Category,Long> {
}
