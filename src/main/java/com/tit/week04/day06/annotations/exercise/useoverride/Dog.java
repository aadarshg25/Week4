package com.tit.week04.day06.annotations.exercise.useoverride;

public class Dog extends Animal {
    // Overriding makeSound() method
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}
