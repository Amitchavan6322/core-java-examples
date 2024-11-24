package com.amit.rating.scheme.model;

public class Review {
    public int reviewId;
    public String heading;
    public String description;
    public int rating;

    @Override
    public String toString() {
        return "Review{" +
                "reviewId=" + reviewId +
                ", heading='" + heading + '\'' +
                ", description='" + description + '\'' +
                ", rating=" + rating +
                '}';
    }
}
