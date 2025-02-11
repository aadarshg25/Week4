package com.tit.week04.day01.generics.resumescreeningsystem;

public class DataScientist extends JobRole {
    private String specialization;

    public DataScientist(String roleName, String specialization) {
        super(roleName);
        this.specialization = specialization;
    }

    @Override
    public void showDetails() {
        System.out.println("Data Scientist: " + getRoleName() + " (Specialization: " + specialization + ")");
    }
}
