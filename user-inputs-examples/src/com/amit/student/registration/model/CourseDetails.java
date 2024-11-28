package com.amit.student.registration.model;

public class CourseDetails {

/* pseudo code
Course ID
Course Name
Course Duration
Course Fee*/

    public int courseID;
    public String courseName;
    public String courseDuration;

    @Override
    public String toString() {
        return "CourseDetails{" +
                "courseID=" + courseID +
                ", courseName='" + courseName + '\'' +
                ", courseDuration='" + courseDuration + '\'' +
                '}';
    }
}
