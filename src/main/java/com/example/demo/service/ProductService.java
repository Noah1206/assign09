package com.example.demo.service;

import com.example.demo.dto.ProductRequest;
import com.example.demo.dto.ProductResponse;
import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import org.apache.coyote.Request;
import org.apache.coyote.Response;

import java.util.List;

public class ProductService {
    private final ProductRepository productRepository;
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductResponse create(ProductRequest request) {
        Product saved = productRepository.save(new Product(request)); // INSERT
        return ProductResponse.from(saved);
    }

    public List<ProductResponse> findAll() {
        return productRepository.findAll().stream().map(this::toResponse).toList();
    }

    private ProductResponse toResponse(Product request) {
        return new ProductResponse(null, request.getName(), request.getDescription(), request.getCategory(), request.getDate(), request.getPrice());
    }
}
