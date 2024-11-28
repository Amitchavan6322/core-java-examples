package com.amit.student.registration.service;

import com.amit.rating.scheme.model.User;
import com.amit.student.registration.model.StudentInfo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StudentService {
    public StudentInfo acceptStudentData() throws ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter student id");
        int studentId = Integer.parseInt(scanner.nextLine());

        System.out.println("Please enter student first name");
        String firstName = scanner.nextLine();

        System.out.println("Please enter student middle name");
        String middleName = scanner.nextLine();

        System.out.println("Please enter student last name");
        String lastName = scanner.nextLine();

        System.out.println("Please enter student date of birth dd/mm/yyyy");
        String dobStr = scanner.nextLine();

        // converting string to date
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        Date dob = sdf.parse(dobStr);

        // initialize entities
        StudentInfo student = new StudentInfo();
        student.studentID = studentId;
        student.firstName = firstName;
        student.middleName = middleName;
        student.lastName = lastName;
        student.dob = dob;

        return student;

    }
}
