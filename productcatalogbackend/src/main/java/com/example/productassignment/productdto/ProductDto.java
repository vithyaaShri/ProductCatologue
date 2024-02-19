package com.example.productassignment.productdto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//This is a dto class which is used to show only required information to the client
public class ProductDto {
    private long id;
    private String productName;
    private long price;
    private String category;
}
