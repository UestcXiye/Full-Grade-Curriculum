package com.uestc.fullgradecurriculum.entity;

import java.math.BigInteger;

public class Course {

    public BigInteger CourseID;
    private String Name;
    private String Section;
    private String Week;
    private String Duration;
    private String Teacher;
    private String Place;

    public Course(){};

    public Course(String name, String section, String week, String duration, String teacher, String place) {
        Name = name;
        Section = section;
        Week = week;
        Duration = duration;
        Teacher = teacher;
        Place = place;
    }

    public BigInteger getCourseID() {
        return CourseID;
    }

    public void setCourseID(BigInteger courseID) {
        CourseID = courseID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSection() {
        return Section;
    }

    public void setSection(String section) {
        Section = section;
    }

    public String getWeek() {
        return Week;
    }

    public void setWeek(String week) {
        Week = week;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String duration) {
        Duration = duration;
    }

    public String getTeacher() {
        return Teacher;
    }

    public void setTeacher(String teacher) {
        Teacher = teacher;
    }

    public String getPlace() {
        return Place;
    }

    public void setPlace(String place) {
        Place = place;
    }

}
