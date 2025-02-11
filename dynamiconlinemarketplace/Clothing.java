package com.tit.week04.day01.generics.dynamiconlinemarketplace;

public class Clothing extends Product {
    private String size;

    public Clothing(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    @Override
    public void showDetails() {
        System.out.println("Clothing: " + getName() + " (Size: " + size + ", Price: " + getPrice() + ")");
    }
}
