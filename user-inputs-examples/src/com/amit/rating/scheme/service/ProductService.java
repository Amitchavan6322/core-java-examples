package com.amit.rating.scheme.service;

import com.amit.rating.scheme.model.Product;
import java.util.Scanner;

public class ProductService {

    public Product acceptProductData(){ // here return type is class name not object name
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter product id");
        int productId = Integer.parseInt(scanner.nextLine());

        System.out.println("Please enter product name");
        String productName = scanner.nextLine();

        System.out.println("Please enter product price");
        double productPrice = Double.parseDouble(scanner.nextLine());

        // initialize entities
        Product product = new Product();
        product.productId = productId;
        product.productName = productName;
        product.productPrice = productPrice;

        return product;
    }
}
