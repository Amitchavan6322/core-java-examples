package com.amit.rating.scheme.service;

import com.amit.rating.scheme.model.User;
import java.util.Scanner;


public class UserService {
    public User acceptUserData(){ // here return type is class name not object name
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter user id");
        int userId = Integer.parseInt(scanner.nextLine());

        System.out.println("Please enter user first name");
        String firstName = scanner.nextLine();

        System.out.println("Please enter user last name");
        String lastName = scanner.nextLine();

        // initialize entities
        User user = new User();
        user.userId = userId;
        user.firstName = firstName;
        user.lastName = lastName;

        return user;

    }
}
