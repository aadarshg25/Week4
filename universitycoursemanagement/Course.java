package com.tit.week04.day01.generics.universitycoursemanagement;
import java.util.ArrayList;
import java.util.List;

public class Course<T extends CourseType> {
    private List<T> courses = new ArrayList<>();

    public void addCourse(T course) {
        courses.add(course);
    }

    public void removeCourse(T course) {
        courses.remove(course);
    }

    public List<T> getCourses() {
        return courses;
    }

    // Wildcard method to display all courses
    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            course.showDetails();
        }
    }

    // Generic method to extend course duration
    public static <T extends CourseType> void extendCourseDuration(T course, int extraWeeks) {
        System.out.println("Extending duration of " + course.getCourseName() + " by " + extraWeeks + " weeks.");
    }
}

