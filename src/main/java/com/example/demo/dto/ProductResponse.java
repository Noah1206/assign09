package com.example.demo.dto;

import com.example.demo.entity.Product;

public record ProductResponse(Long id, String name, String description,  String category, Integer date, Integer price) {
    public static ProductResponse from(Product product) {
        return new ProductResponse(product.getId(), product.getName(), product.getDescription(), product.getCategory(), product.getDate(), product.getPrice()
        );
    }
}