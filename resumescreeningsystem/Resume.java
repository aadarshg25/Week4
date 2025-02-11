package com.tit.week04.day01.generics.resumescreeningsystem;

import java.util.ArrayList;
import java.util.List;

public class Resume<T extends JobRole> {
    private List<T> resumes = new ArrayList<>();

    public void addResume(T resume) {
        resumes.add(resume);
    }

    public void removeResume(T resume) {
        resumes.remove(resume);
    }

    public List<T> getResumes() {
        return resumes;
    }

    // Wildcard method to display all resumes
    public static void displayResumes(List<? extends JobRole> resumes) {
        for (JobRole resume : resumes) {
            resume.showDetails();
        }
    }

    // Generic method to process resumes
    public static <T extends JobRole> void processResume(T resume) {
        System.out.println("Processing resume for: " + resume.getRoleName());
    }
}
