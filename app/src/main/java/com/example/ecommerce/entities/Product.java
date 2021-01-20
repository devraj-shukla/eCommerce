package com.example.ecommerce.entities;

public class Product {
    int productId;

    public Product(int productId, String productName, String category, int price, String productImages) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.productImages = productImages;
    }

    public Product() {
    }

    public int getproductId() {
        return productId;
    }

    public void setpId(int pId) {
        this.productId = pId;
    }

    String productName;
    String category;
    int price;
    String productImages;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProductImages() {
        return productImages;
    }

    public void setProductImages(String productImages) {
        this.productImages = productImages;
    }
}
