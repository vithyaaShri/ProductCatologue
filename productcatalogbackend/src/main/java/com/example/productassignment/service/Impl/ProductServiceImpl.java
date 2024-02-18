package com.example.productassignment.service.Impl;

import com.example.productassignment.entity.Product;
import com.example.productassignment.productdto.ProductDto;
import com.example.productassignment.repository.ProductRepository;
import com.example.productassignment.service.ProductService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor


public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;
    private ModelMapper modelMapper;

    @Override
    public ProductDto saveProduct(ProductDto productDto) {
        Product product=modelMapper.map(productDto, Product.class);
        Product savedproduct=productRepository.save(product);
    return modelMapper.map(savedproduct,ProductDto.class);
    }
//public Product saveProduct(Product product) {
//    return productRepository.save(product);
//}


    @Override
    public List<Product> getProduct() {
        return productRepository.findAll();
    }
}
