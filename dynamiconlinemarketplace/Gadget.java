package com.tit.week04.day01.generics.dynamiconlinemarketplace;

public class Gadget extends Product {
    private String brand;

    public Gadget(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    @Override
    public void showDetails() {
        System.out.println("Gadget: " + getName() + " (Brand: " + brand + ", Price: " + getPrice() + ")");
    }
}
