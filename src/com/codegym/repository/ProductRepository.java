package com.codegym.repository;

import com.codegym.model.Product;

public class ProductRepository implements GeneralRepository<Product> {

    Product[] listProduct = new Product[20];
    {
        listProduct[0] = new Product(1,"Samsung");
        listProduct[1] = new Product(2,"Iphone");
        listProduct[2] = new Product(3,"OPPO");
    }

    @Override
    public Product[] findAll() {
        return listProduct;
    }
}
