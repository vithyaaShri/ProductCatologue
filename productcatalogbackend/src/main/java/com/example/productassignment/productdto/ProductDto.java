package com.example.productassignment.productdto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    private long id;
    private String productName;
    private long price;
    private String category;
}
