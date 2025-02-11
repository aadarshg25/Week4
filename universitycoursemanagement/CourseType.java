package com.tit.week04.day01.generics.universitycoursemanagement;

public abstract class CourseType {
    private String courseName;
    private int duration;

    public CourseType(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getDuration() {
        return duration;
    }

    public abstract void showDetails();
}



