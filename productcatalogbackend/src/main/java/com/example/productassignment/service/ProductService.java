package com.example.productassignment.service;

import com.example.productassignment.entity.Product;
import com.example.productassignment.productdto.ProductDto;
import org.springframework.stereotype.Service;

import java.util.List;

//It is an Interface and Used class Product srvice to implements its Method
public interface ProductService {
   ProductDto saveProduct(ProductDto productDto);
   //Product saveProduct(Product product);
   List<Product> getProduct();
}
