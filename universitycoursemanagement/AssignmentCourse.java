package com.tit.week04.day01.generics.universitycoursemanagement;

public class AssignmentCourse extends CourseType {
    private int assignmentCount;

    public AssignmentCourse(String courseName, int duration, int assignmentCount) {
        super(courseName, duration);
        this.assignmentCount = assignmentCount;
    }

    @Override
    public void showDetails() {
        System.out.println("Assignment Course: " + getCourseName() + " (Duration: " + getDuration() + " weeks, Assignments: " + assignmentCount + ")");
    }
}
