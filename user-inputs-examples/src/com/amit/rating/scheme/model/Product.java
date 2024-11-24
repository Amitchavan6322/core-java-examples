package com.amit.rating.scheme.model;

public class Product {
    public int productId;
    public String productName;
    public double productPrice;

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
