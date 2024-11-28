package com.amit.rating.scheme.service;

import com.amit.rating.scheme.model.Review;

import java.util.Scanner;

public class ReviewService {

    public Review acceptReviewData(){ // here return type is class name not object name
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter review id");
        int reviewId = Integer.parseInt(scanner.nextLine());

        System.out.println("Please enter review heading");
        String heading = scanner.nextLine();

        System.out.println("Please enter review description");
        String description = scanner.nextLine();

        System.out.println("Please provide rating");
        int rating = Integer.parseInt(scanner.nextLine());

        // initialize entities
        Review review = new Review();
        review.reviewId = reviewId;
        review.heading = heading;
        review.description = description;
        review.rating = rating;

        return review;
    }
}
