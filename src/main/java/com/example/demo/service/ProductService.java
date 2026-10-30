package com.example.demo.service;

import com.example.demo.dto.ProductRequest;
import com.example.demo.dto.ProductResponse;
import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import org.apache.coyote.Request;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

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

    public ProductResponse findById(Long id) {
        return toResponse(checkProduct(id));
    }

    private Product checkProduct(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Product is not found " + id));
    }

    private ProductResponse toResponse(Product request) {
        return new ProductResponse(null, request.getName(), request.getDescription(), request.getCategory(), request.getDate(), request.getPrice());
    }
}
