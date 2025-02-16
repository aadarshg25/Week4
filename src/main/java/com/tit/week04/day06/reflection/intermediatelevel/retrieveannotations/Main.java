package com.tit.week04.day06.reflection.intermediatelevel.retrieveannotations;

public class Main {
    public static void main(String[] args) {
        Class<Book> bookClass = Book.class;
        if (bookClass.isAnnotationPresent(Author.class)) {
            Author author = bookClass.getAnnotation(Author.class);
            System.out.println("Author: " + author.name());
        } else {
            System.out.println("No Author annotation present.");
        }
    }
}