package com.amit.student.registration.service;

import com.amit.student.registration.model.CourseDetails;
import com.amit.student.registration.model.StudentAddress;

import java.util.Scanner;

public class CourseDetailService {

    public CourseDetails acceptCourseDetails(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter course id");
        int courseID = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter course name");
        String courseName = scanner.nextLine();

        System.out.println("Enter course duration");
        String courseDuraton = scanner.nextLine();

        // initialize entities
        CourseDetails courseDetails = new CourseDetails();

        courseDetails.courseID = courseID;
        courseDetails.courseName = courseName;
        courseDetails.courseDuration = courseDuraton;

        return courseDetails;
    }
}
