package com.tit.week04.day06.reflection.basiclevel.accessprivatefield;

import java.lang.reflect.Field;

public class AccessPrivateField {
    public static void main(String[] args) {
        Person person = new Person(25);

        try {
            Field ageField = Person.class.getDeclaredField("age");
            ageField.setAccessible(true);

            // Get the value of the private field
            int ageValue = (int) ageField.get(person);
            System.out.println("Original Age: " + ageValue);

            // Modify the value of the private field
            ageField.set(person, 30);
            System.out.println("Modified Age: " + person.getAge());

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
