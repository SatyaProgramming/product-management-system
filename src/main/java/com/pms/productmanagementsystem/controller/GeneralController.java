package com.pms.productmanagementsystem.controller;

import com.pms.productmanagementsystem.entity.Product;
import com.pms.productmanagementsystem.service.GeneralService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GeneralController {
    private final GeneralService generalService;

    public GeneralController(GeneralService generalService) {
        this.generalService = generalService;
    }

    //    save product
    @PostMapping("/saveProduct")
    public String saveProduct(@RequestBody Product product) {
        Product product1 = generalService.saveProduct(product);
        if (product1 != null) {
            return "Product saved successfully";
        } else {
            return "Product not saved";
        }
    }

//    get all products
    @PostMapping("/getAllProducts")
    public List<Product> getAllProducts() {
        return generalService.findAllProducts();
    }

//    get product by id
    @GetMapping("/getProductById")
    public Product getProductById(@RequestParam Long id) {
        return generalService.findProductById(id);
    }

//    delete product by id
    @DeleteMapping("/deleteProductById")
    public String deleteProductById(@RequestParam Long id) {
        generalService.deleteProduct(id);
        return "Product deleted successfully";
    }
}
