package com.amit.rating.scheme.model;

public class User {
    public int userId;
    public String firstName;
    public String lastName;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
