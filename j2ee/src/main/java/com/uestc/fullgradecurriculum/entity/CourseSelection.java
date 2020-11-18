package com.uestc.fullgradecurriculum.entity;

import java.math.BigInteger;

public class CourseSelection {

    public BigInteger Course_SelectionID;
    public BigInteger StudentID;
    public BigInteger CourseID;

    public CourseSelection(BigInteger course_SelectionID, BigInteger studentID, BigInteger courseID) {
        Course_SelectionID = course_SelectionID;
        StudentID = studentID;
        CourseID = courseID;
    }

    public CourseSelection(){};

    public BigInteger getCourse_SelectionID() {
        return Course_SelectionID;
    }

    public void setCourse_SelectionID(BigInteger course_SelectionID) {
        Course_SelectionID = course_SelectionID;
    }

    public BigInteger getStudentID() {
        return StudentID;
    }

    public void setStudentID(BigInteger studentID) {
        StudentID = studentID;
    }

    public BigInteger getCourseID() {
        return CourseID;
    }

    public void setCourseID(BigInteger courseID) {
        CourseID = courseID;
    }
}
