package com.example.ecommerce.responses;

import com.example.ecommerce.entities.Product;

import java.util.List;

public class ProductListResponse extends BasicResponse {
    List<Product> products;
    float lowestPrice;

    public float getLowestPrice() {
        return lowestPrice;
    }

    public List<Product> getProducts() {
        return products;
    }
}
