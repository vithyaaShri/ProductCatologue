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

//This class implements methods from Interface ProductService
public class ProductServiceImpl implements ProductService {
    //Object of Repository class
    private ProductRepository productRepository;
    private ModelMapper modelMapper;

    //This is the method for Insert and implmented using dao and modelMapper
    @Override
    public ProductDto saveProduct(ProductDto productDto) {
        Product product=modelMapper.map(productDto, Product.class);
        Product savedproduct=productRepository.save(product);
    return modelMapper.map(savedproduct,ProductDto.class);
    }

    //It is the get all method to display all in table
    @Override
    public List<Product> getProduct() {
        return productRepository.findAll();
    }
}
