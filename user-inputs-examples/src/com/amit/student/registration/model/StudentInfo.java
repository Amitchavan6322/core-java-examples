package com.amit.student.registration.model;

import java.util.Date;

public class StudentInfo {

/*  Pseudo Code
    Student ID
    First Name
    Middle Name
    Last Name
    DOB*/

    public int studentID;
    public String firstName;
    public String middleName;
    public String lastName;
    public Date dob;
    public String emailID;
    public int mobileNo;

    @Override
    public String toString() {
        return "StudentInfo{" +
                "studentID=" + studentID +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                ", emailID='" + emailID + '\'' +
                ", mobileNo=" + mobileNo +
                '}';
    }
}
