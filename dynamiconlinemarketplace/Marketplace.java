package com.tit.week04.day01.generics.dynamiconlinemarketplace;

public class Marketplace {
    public static void main(String[] args) {
        ProductCatalog<Book> bookCatalog = new ProductCatalog<>();
        Book book1 = new Book("Java Programming", 600, "James Gosling");
        Book book2 = new Book("One Piece", 749, "Oda");
        bookCatalog.addProduct(book1);
        bookCatalog.addProduct(book2);

        ProductCatalog<Clothing> clothingCatalog = new ProductCatalog<>();
        Clothing clothing1 = new Clothing("T-Shirt", 499, "L");
        Clothing clothing2 = new Clothing("Jeans", 1200, "M");
        clothingCatalog.addProduct(clothing1);
        clothingCatalog.addProduct(clothing2);

        ProductCatalog<Gadget> gadgetCatalog = new ProductCatalog<>();
        Gadget gadget1 = new Gadget("Smartphone", 5000, "Samsung");
        Gadget gadget2 = new Gadget("Laptop", 65499, "Dell");
        gadgetCatalog.addProduct(gadget1);
        gadgetCatalog.addProduct(gadget2);

        // Display products using wildcard method
        System.out.println("\nBook Catalog:");
        ProductCatalog.displayProducts(bookCatalog.getProducts());

        System.out.println("\nClothing Catalog:");
        ProductCatalog.displayProducts(clothingCatalog.getProducts());

        System.out.println("\nGadget Catalog:");
        ProductCatalog.displayProducts(gadgetCatalog.getProducts());

        // Apply discount
        System.out.println("\nApplying Discounts:");
        ProductCatalog.applyDiscount(book1, 10);
        ProductCatalog.applyDiscount(clothing1, 15);
        ProductCatalog.applyDiscount(gadget1, 5);
    }
}
