package com.tit.week04.day01.generics.universitycoursemanagement;

public class ExamCourse extends CourseType {
    private int examWeightage;

    public ExamCourse(String courseName, int duration, int examWeightage) {
        super(courseName, duration);
        this.examWeightage = examWeightage;
    }

    @Override
    public void showDetails() {
        System.out.println("Exam Course: " + getCourseName() + " (Duration: " + getDuration() + " weeks, Exam Weightage: " + examWeightage + "%)");
    }
}


