package com.tit.week04.day01.generics.smartwarehousemanagement;

public class Electronics extends WarehouseItem {
    private String brand;

    public Electronics(String name, String brand) {
        super(name);
        this.brand = brand;
    }

    @Override
    public void showDetails() {
        System.out.println("Electronics: " + getName() + " (Brand: " + brand + ")");
    }
}
