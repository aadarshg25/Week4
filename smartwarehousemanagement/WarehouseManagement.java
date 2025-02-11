package com.tit.week04.day01.generics.smartwarehousemanagement;

public class WarehouseManagement {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop", "Dell"));
        electronicsStorage.addItem(new Electronics("Smartphone", "Samsung"));

        Storage<Groceries> groceryStorage = new Storage<>();
        groceryStorage.addItem(new Groceries("Apple", "2025-01-01"));
        groceryStorage.addItem(new Groceries("Milk", "2024-06-30"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair", "Wood"));
        furnitureStorage.addItem(new Furniture("Table", "Metal"));


        System.out.println("\nElectronics Storage:");
        Storage.displayItems(electronicsStorage.getItems());

        System.out.println("\nGrocery Storage:");
        Storage.displayItems(groceryStorage.getItems());

        System.out.println("\nFurniture Storage:");
        Storage.displayItems(furnitureStorage.getItems());
    }
}
