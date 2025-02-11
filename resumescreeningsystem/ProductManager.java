package com.tit.week04.day01.generics.resumescreeningsystem;

public class ProductManager extends JobRole {
    private String domain;

    public ProductManager(String roleName, String domain) {
        super(roleName);
        this.domain = domain;
    }

    @Override
    public void showDetails() {
        System.out.println("Product Manager: " + getRoleName() + " (Domain: " + domain + ")");
    }
}
