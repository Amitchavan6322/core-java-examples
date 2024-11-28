package com.amit.student.registration;

import com.amit.student.registration.model.CourseDetails;
import com.amit.student.registration.model.StudentAddress;
import com.amit.student.registration.model.StudentInfo;
import com.amit.student.registration.service.CourseDetailService;
import com.amit.student.registration.service.StudentAddressService;
import com.amit.student.registration.service.StudentService;

import java.text.ParseException;

public class StudentRegistrationSystem {

    public static void main(String[] args) throws ParseException {

        System.out.println("Welcome to the student registration system");
        StudentService studentService = new StudentService();
        StudentInfo student = studentService.acceptStudentData();

        StudentAddressService addressService = new StudentAddressService();
        StudentAddress address = addressService.acceptStudentAddress();

        CourseDetailService courseService = new CourseDetailService();
        CourseDetails details = courseService.acceptCourseDetails();

        // completed all processing
        // print the data on console

        System.out.println("Student details : " +student);
        System.out.println("Student Address : " +address);
        System.out.println("Course details : " +details);

    }
}
