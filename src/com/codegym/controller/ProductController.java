package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.ProductService;

public class ProductController {

    ProductService productService = new ProductService();

    public Product[] findAll() {
        return productService.findAll();
    }
}
