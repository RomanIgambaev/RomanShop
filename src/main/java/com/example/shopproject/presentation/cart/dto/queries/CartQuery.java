package com.example.shopproject.presentation.cart.dto.queries;

import com.example.shopproject.presentation.product.dto.queries.ProductQuery;
import lombok.Data;

import java.util.List;

@Data
public class CartQuery {
    private Long id;
    private String userName;
    private List<ProductQuery> products;
}

