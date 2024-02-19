package com.example.productassignment.repository;

import com.example.productassignment.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//Repository class and gets the methods from JpaRepository Class
@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
