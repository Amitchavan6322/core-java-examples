package com.amit.govtschemeapp.model;

public class Person {


    public String firstName;
    public String lastName;

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

}
