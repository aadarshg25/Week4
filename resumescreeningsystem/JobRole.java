package com.tit.week04.day01.generics.resumescreeningsystem;

public abstract class JobRole {
    private String roleName;

    public JobRole(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }

    public abstract void showDetails();
}
