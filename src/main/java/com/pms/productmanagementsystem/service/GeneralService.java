package com.pms.productmanagementsystem.service;

import com.pms.productmanagementsystem.entity.Product;
import com.pms.productmanagementsystem.repo.CategoryRepo;
import com.pms.productmanagementsystem.repo.ProductRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Slf4j
@Service
public class GeneralService {
    private final ProductRepo productRepo;
    private final CategoryRepo categoryRepo;

    public GeneralService(ProductRepo productRepo, CategoryRepo categoryRepo) {
        this.productRepo = productRepo;
        this.categoryRepo = categoryRepo;
    }

    //save category and product
    public Product saveProduct(Product product) {
        log.info("Product saved successfully");
        categoryRepo.save(product.getCategoryId());
        return productRepo.save(product);

    }

    //    get all products with category
    public List<Product> findAllProducts() {
        log.info("All products fetched successfully");
        return productRepo.findAll();
    }

    //    get product by id
    public Product findProductById(Long id) {
        log.info("Product fetched successfully");
        return productRepo.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
    }

    //    delete product by id
    public void deleteProduct(Long id) {
        productRepo.deleteById(id);
        log.info("Product deleted successfully");
    }
}
