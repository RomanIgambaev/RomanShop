package com.example.shopproject.presentation.product.dto.queries;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductQuery {
    private Long id;
    private String name;
    private double price;
    private String categoryName;
}
