package com.tit.week04.day01.generics.smartwarehousemanagement;

import java.util.ArrayList;
import java.util.List;

public class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void removeItem(T item) {
        items.remove(item);
    }

    // 4. Wildcard method to display all items
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            item.showDetails();
        }
    }

    public List<T> getItems() {
        return items;
    }
}
