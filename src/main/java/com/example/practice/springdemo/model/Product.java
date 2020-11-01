package com.example.practice.springdemo.model;

public class Product {

    private String productID;
    private String productName;

    public Product(String productID, String productName) {
        this.productID = productID;
        this.productName = productName;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
