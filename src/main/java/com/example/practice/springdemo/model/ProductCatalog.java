package com.example.practice.springdemo.model;


public class ProductCatalog {

    private String id;
    private Product product;
    private Brand brand;
    private Color color;

    public ProductCatalog(String id, Product product, Brand brand, Color color) {
        this.id = id;
        this.product = product;
        this.brand = brand;
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
