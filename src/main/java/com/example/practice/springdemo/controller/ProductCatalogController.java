package com.example.practice.springdemo.controller;

import com.example.practice.springdemo.model.ProductCatalog;
import com.example.practice.springdemo.service.ProductCatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductCatalogController {

    @Autowired
    private ProductCatalogService productCatalogService;

    @GetMapping("/")
    public String showHome() {
        return ("Welcome to Product Catalog");
    }

    @GetMapping("/products")
    public ResponseEntity getAllProducts() {
        System.out.println("Request to find all products->");
        try {
            List<ProductCatalog> productCatalogList = productCatalogService.getAllProductCatalog();
            return new ResponseEntity<>(productCatalogList, HttpStatus.FOUND);
        } catch (Exception ex) {
            return new ResponseEntity<>("Error while getting all product catalog", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/brands/{brand}")
    public ResponseEntity getProductsByBrand(@PathVariable String brand) {
        System.out.println("Request to group product catalog by brand");
        try {
            List<ProductCatalog> productCatalogs = productCatalogService.getAllProductByBrand(brand);
            return new ResponseEntity(productCatalogs, HttpStatus.FOUND);
        } catch (Exception ex) {
            return new ResponseEntity<>("Error while getting all product by brand", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
