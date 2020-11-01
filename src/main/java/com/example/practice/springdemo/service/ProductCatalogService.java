package com.example.practice.springdemo.service;

import com.example.practice.springdemo.model.ProductCatalog;

import java.util.List;

public interface ProductCatalogService {

    public List<ProductCatalog> getAllProductCatalog();

    public List<ProductCatalog> getAllProductByBrand(String brand);

}
