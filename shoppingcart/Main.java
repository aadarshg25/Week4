package com.tit.week04.day02.collections.shoppingcart;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addProduct("Laptop", 1000);
        cart.addProduct("Phone", 500);
        cart.addProduct("Headphones", 100);

        cart.displayProductsByPrice();

        cart.addToCart("Phone", 2);
        cart.addToCart("Laptop", 1);
        cart.addToCart("Headphones", 3);

        cart.displayCart();
        cart.calculateTotal();
    }
}
