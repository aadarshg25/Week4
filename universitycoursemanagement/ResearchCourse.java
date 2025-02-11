package com.tit.week04.day01.generics.universitycoursemanagement;

public class ResearchCourse extends CourseType {
    private String researchField;

    public ResearchCourse(String courseName, int duration, String researchField) {
        super(courseName, duration);
        this.researchField = researchField;
    }

    @Override
    public void showDetails() {
        System.out.println("Research Course: " + getCourseName() + " (Duration: " + getDuration() + " weeks, Field: " + researchField + ")");
    }
}
