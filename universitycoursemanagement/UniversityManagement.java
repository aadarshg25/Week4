package com.tit.week04.day01.generics.universitycoursemanagement;

public class UniversityManagement {
    public static void main(String[] args) {
        Course<ExamCourse> examCourseCatalog = new Course<>();
        ExamCourse exam1 = new ExamCourse("Data Structures", 12, 70);
        ExamCourse exam2 = new ExamCourse("Operating Systems", 10, 60);
        examCourseCatalog.addCourse(exam1);
        examCourseCatalog.addCourse(exam2);

        Course<AssignmentCourse> assignmentCourseCatalog = new Course<>();
        AssignmentCourse assignment1 = new AssignmentCourse("Software Engineering", 14, 5);
        AssignmentCourse assignment2 = new AssignmentCourse("Web Development", 8, 7);
        assignmentCourseCatalog.addCourse(assignment1);
        assignmentCourseCatalog.addCourse(assignment2);

        Course<ResearchCourse> researchCourseCatalog = new Course<>();
        ResearchCourse research1 = new ResearchCourse("Artificial Intelligence", 16, "Machine Learning");
        ResearchCourse research2 = new ResearchCourse("Cybersecurity", 20, "Network Security");
        researchCourseCatalog.addCourse(research1);
        researchCourseCatalog.addCourse(research2);

        System.out.println("\nExam Courses:");
        Course.displayCourses(examCourseCatalog.getCourses());

        System.out.println("\nAssignment Courses:");
        Course.displayCourses(assignmentCourseCatalog.getCourses());

        System.out.println("\nResearch Courses:");
        Course.displayCourses(researchCourseCatalog.getCourses());

        // Extend course duration
        System.out.println("\nExtending Course Duration:");
        Course.extendCourseDuration(exam1, 2);
        Course.extendCourseDuration(assignment1, 3);
        Course.extendCourseDuration(research1, 4);
    }
}
