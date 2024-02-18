package com.example.productassignment.service;

import com.example.productassignment.entity.Product;
import com.example.productassignment.productdto.ProductDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {
   ProductDto saveProduct(ProductDto productDto);
   //Product saveProduct(Product product);
   List<Product> getProduct();
}
