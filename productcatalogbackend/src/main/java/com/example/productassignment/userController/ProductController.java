package com.example.productassignment.userController;

import com.example.productassignment.entity.Product;
import com.example.productassignment.productdto.ProductDto;
import com.example.productassignment.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/product")
    public List<Product> getAllEmployees() {
        return productService.getProduct();
    }
//    @PostMapping("/product/post")
//    public Product saveProduct(@RequestBody Product product) {
//        return productService.saveProduct(product);
//    }
    @PostMapping("/product/post")
    public ProductDto saveProduct(@RequestBody ProductDto productdto) {
        return productService.saveProduct(productdto);
    }
}