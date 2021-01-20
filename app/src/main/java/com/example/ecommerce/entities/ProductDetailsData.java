package com.example.ecommerce.entities;

public class ProductDetailsData {
    int pId;

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    String productName;
    String merchantName;
    int price;
    String description;
    String image;
    int quantity;

    public ProductDetailsData() {
    }

    public ProductDetailsData(int pId, String productName, String merchantName, int price, String description, String image, int quantity) {
        this.pId = pId;
        this.productName = productName;
        this.merchantName = merchantName;
        this.price = price;
        this.description = description;
        this.image = image;
        this.quantity = quantity;
    }

    // how to make the value default to be one
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
