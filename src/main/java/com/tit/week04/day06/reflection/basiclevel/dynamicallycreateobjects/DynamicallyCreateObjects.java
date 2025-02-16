package com.tit.week04.day06.reflection.basiclevel.dynamicallycreateobjects;

import java.lang.reflect.Constructor;

public class DynamicallyCreateObjects {
    public static void main(String[] args) {
        try {
            Class<?> studentClass = Class.forName("com.tit.week04.day06.reflection.basiclevel.dynamicallycreateobjects.Student");
            Constructor<?> constructor = studentClass.getDeclaredConstructor();

            Object studentInstance = constructor.newInstance();
            Student student = (Student) studentInstance;

            System.out.println("Student Name: " + student.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}