package com.example.productassignment.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="products")
@Entity

public class Product {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String productName;
    private long price;
    private String category;
}
