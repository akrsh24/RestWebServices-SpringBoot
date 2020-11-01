package com.example.practice.springdemo.service;

import com.example.practice.springdemo.model.Brand;
import com.example.practice.springdemo.model.Color;
import com.example.practice.springdemo.model.Product;
import com.example.practice.springdemo.model.ProductCatalog;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductCatalogServiceImpl implements ProductCatalogService {

    private List<ProductCatalog> productCatalogList = new ArrayList<>();

    public ProductCatalogServiceImpl() {
        Product product = new Product("1", "Shirt");
        Brand brand = new Brand("1", "Nike");
        Color color = new Color("1", "Red");
        productCatalogList.add(new ProductCatalog("1", product, brand, color));


        Product product1 = new Product("2", "TShirt");
        Brand brand1 = new Brand("2", "Puma");
        Color color1 = new Color("2", "Yellow");
        productCatalogList.add(new ProductCatalog("2", product1, brand1, color1));

        Product product2 = new Product("3", "PShirt");
        Brand brand2 = new Brand("3", "Puma");
        Color color2 = new Color("3", "Orange");
        productCatalogList.add(new ProductCatalog("3", product2, brand2, color2));
    }


    @Override
    public List<ProductCatalog> getAllProductCatalog() {
        return productCatalogList;
    }

    private List<ProductCatalog> getProductsByBrand(String brand) {
        List<ProductCatalog> filteredList = new ArrayList<>();
        productCatalogList.forEach(productCatalog -> {
            if (productCatalog.getBrand().getBrandName().equals(brand))
                filteredList.add(productCatalog);
        });

        return filteredList;
    }

    @Override
    public List<ProductCatalog> getAllProductByBrand(String brand) {
        List<ProductCatalog> productCatalog = getProductsByBrand(brand);
        return productCatalog;
    }
}
