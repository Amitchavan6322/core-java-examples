package com.amit.rating.scheme;

import com.amit.rating.scheme.model.Product;
import com.amit.rating.scheme.model.Review;
import com.amit.rating.scheme.model.User;
import com.amit.rating.scheme.service.ProductService;
import com.amit.rating.scheme.service.ReviewService;
import com.amit.rating.scheme.service.UserService;

public class EcommerceReviewSystem {

    public static void main(String[] args) {

        System.out.println("Welcome to E-Commerce Review System");

        UserService userService = new UserService();
        User userDetails = userService.acceptUserData();

        ProductService productService = new ProductService();
        Product productDetails = productService.acceptProductData();

        ReviewService reviewService = new ReviewService();
        Review reviewDetails = reviewService.acceptReviewData();

        // completed all processing
        // print the data on console

        System.out.println("User details : " +userDetails);
        System.out.println("Product details : " +productDetails);
        System.out.println("Review details : " +reviewDetails);
    }
}
