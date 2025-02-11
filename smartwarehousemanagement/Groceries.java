package com.tit.week04.day01.generics.smartwarehousemanagement;

public class Groceries extends WarehouseItem {
    private String expiryDate;

    public Groceries(String name, String expiryDate) {
        super(name);
        this.expiryDate = expiryDate;
    }

    @Override
    public void showDetails() {
        System.out.println("Groceries: " + getName() + " (Expiry: " + expiryDate + ")");
    }
}
