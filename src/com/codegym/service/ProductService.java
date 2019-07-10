package com.codegym.service;

import com.codegym.model.Product;
import com.codegym.repository.ProductRepository;

public class ProductService implements GeneralService<Product>{

    ProductRepository productRepository = new ProductRepository();

    @Override
    public Product[] findAll() {
        return productRepository.findAll();
    }
}
