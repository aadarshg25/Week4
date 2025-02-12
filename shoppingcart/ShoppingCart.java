package com.tit.week04.day02.collections.shoppingcart;

import java.util.*;

class ShoppingCart {
    private Map<String, Double> productPrices = new HashMap<>();
    private LinkedHashMap<String, Integer> cart = new LinkedHashMap<>();
    private TreeMap<Double, String> sortedProducts = new TreeMap<>();

    // Add a product to the system
    public void addProduct(String product, double price) {
        productPrices.put(product, price);
        sortedProducts.put(price, product);
    }

    // Add an item to the cart
    public void addToCart(String product, int quantity) {
        if (productPrices.containsKey(product)) {
            cart.put(product, cart.getOrDefault(product, 0) + quantity);
            System.out.println(quantity + " x " + product + " added to cart.");
        } else {
            System.out.println("Product not found!");
        }
    }

    // Display cart items
    public void displayCart() {
        System.out.println("\nShopping Cart:");
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + " x " + entry.getValue() + " ($" + productPrices.get(entry.getKey()) + " each)");
        }
    }

    // Display products sorted by price
    public void displayProductsByPrice() {
        System.out.println("\nProducts Sorted by Price:");
        for (Map.Entry<Double, String> entry : sortedProducts.entrySet()) {
            System.out.println(entry.getValue() + " - $" + entry.getKey());
        }
    }

    // Calculate total price of the cart
    public void calculateTotal() {
        double total = 0;
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            total += productPrices.get(entry.getKey()) * entry.getValue();
        }
        System.out.println("\nTotal Price: $" + total);
    }
}


