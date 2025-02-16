package com.tit.week04.day06.reflection.basiclevel.classinformation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ClassInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the fully qualified class name (e.g., java.util.ArrayList): ");
        String className = scanner.nextLine();
        System.out.print(getClassInformation(className));
    }

    public static String getClassInformation(String className) {
        StringBuilder result = new StringBuilder();
        try {
            Class<?> clazz = Class.forName(className);

            result.append("Class Name: ").append(clazz.getName()).append("\n\n");

            result.append("Fields:\n");
            Field[] fields = clazz.getDeclaredFields();
            if (fields.length == 0) {
                result.append("No fields found\n");
            } else {
                for (Field field : fields) {
                    result.append(field.toString()).append("\n");
                }
            }

            result.append("\nMethods:\n");
            Method[] methods = clazz.getDeclaredMethods();
            if (methods.length == 0) {
                result.append("No methods found\n");
            } else {
                for (Method method : methods) {
                    result.append(method.toString()).append("\n");
                }
            }

            result.append("\nConstructors:\n");
            Constructor<?>[] constructors = clazz.getDeclaredConstructors();
            if (constructors.length == 0) {
                result.append("No constructors found\n");
            } else {
                for (Constructor<?> constructor : constructors) {
                    result.append(constructor.toString()).append("\n");
                }
            }
        } catch (ClassNotFoundException e) {
            result.append("Class not found: ").append(e.getMessage()).append("\n");
        }
        return result.toString();
    }
}
