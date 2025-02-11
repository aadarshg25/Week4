package com.tit.week04.day01.generics.dynamiconlinemarketplace;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalog<T extends Product> {
    private List<T> products = new ArrayList<>();

    public void addProduct(T product) {
        products.add(product);
    }

    public void removeProduct(T product) {
        products.remove(product);
    }

    // Wildcard method to display all products
    public static void displayProducts(List<? extends Product> products) {
        for (Product product : products) {
            product.showDetails();
        }
    }

    public List<T> getProducts() {
        return products;
    }

    // Generic method to apply discount
    public static <T extends Product> void applyDiscount(T product, double percentage) {
        double discountAmount = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discountAmount);
        System.out.println("Discount applied! New Price of " + product.getName() + ": " + product.getPrice());
    }
}