package com.amit.student.registration.service;

import com.amit.student.registration.model.StudentAddress;
import com.amit.student.registration.model.StudentInfo;

import java.util.Scanner;

public class StudentAddressService {

    public StudentAddress acceptStudentAddress() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student address id");
        int addressID = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter student house no & Building Name");
        String houseNoBuildingName = scanner.nextLine();

        System.out.println("Enter nearby landmark");
        String landmark = scanner.nextLine();

        System.out.println("Enter city name");
        String city = scanner.nextLine();

        System.out.println("Enter tehshil name");
        String tehshil = scanner.nextLine();

        System.out.println("Enter district name");
        String district = scanner.nextLine();

        System.out.println("Enter state name");
        String state = scanner.nextLine();

        System.out.println("Enter pin code");
        int pin = Integer.parseInt(scanner.nextLine());

        // initialize entities
        StudentAddress address = new StudentAddress();

        address.addressID = addressID;
        address.houseNoBuildingName = houseNoBuildingName;
        address.landmark = landmark;
        address.city = city;
        address.tehshil = tehshil;
        address.district = district;
        address.state = state;
        address.pin = pin;

        return address;


    }
}
