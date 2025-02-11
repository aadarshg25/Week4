package com.tit.week04.day01.generics.dynamiconlinemarketplace;

public class Book extends Product {
    private String author;

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    @Override
    public void showDetails() {
        System.out.println("Book: " + getName() + " (Author: " + author + ", Price: " + getPrice() + ")");
    }
}
