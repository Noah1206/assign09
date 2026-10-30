package com.example.demo.dto;
public record ProductRequest(
    String name,
    String description,
    String category,
    Integer date,
    Integer price
) {}