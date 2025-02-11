package com.tit.week04.day01.generics.smartwarehousemanagement;

public class Furniture extends WarehouseItem {
    private String material;

    public Furniture(String name, String material) {
        super(name);
        this.material = material;
    }

    @Override
    public void showDetails() {
        System.out.println("Furniture: " + getName() + " (Material: " + material + ")");
    }
}
