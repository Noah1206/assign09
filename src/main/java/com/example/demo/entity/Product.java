package com.example.demo.entity;

import com.example.demo.dto.ProductRequest;
import jakarta.persistence.*;

@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 200)
    private String name;

    @Column(nullable = false, length = 100)
    private String description;

    @Column(nullable = false, length = 50)
    private String category;

    @Column(nullable = false, length = 200)
    private Integer date;

    @Column(nullable = false)
    private Integer price;

    protected Product() { } // JPA uses the no-args constructor.

    public Product(ProductRequest request) {
        this.name = request.name();
        this.description = request.description();
        this.price = request.price();
        this.date = request.date();
        this.category = request.category();
    }


    public void update(ProductRequest request) {
        this.name = request.name();
        this.description = request.description();
        this.category = request.category();
        this.price = request.price();
        this.date = request.date();
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getCategory() { return category; }
    public Integer getDate() { return date; }
    public Integer getPrice() { return price; }
}
