package com.amit.practice.model;

import java.util.Scanner;

public class GovtSchemeDemoApplication {
    public static void main(String[] args) {
        // new operator provides new object
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first name");
        String firstName = scanner.nextLine();

        System.out.println("Please enter last name");
        String lastName = scanner.nextLine();


        Person person = new Person();
        person.firstName = firstName;
        person.lastName = lastName;

        System.out.println("Person details received in system" + person);

    }
}