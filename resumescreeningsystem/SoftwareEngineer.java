package com.tit.week04.day01.generics.resumescreeningsystem;

public class SoftwareEngineer extends JobRole {
    private String programmingLanguage;

    public SoftwareEngineer(String roleName, String programmingLanguage) {
        super(roleName);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void showDetails() {
        System.out.println("Software Engineer: " + getRoleName() + " (Primary Language: " + programmingLanguage + ")");
    }
}
