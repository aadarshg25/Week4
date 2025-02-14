package com.tit.week04.day04.exceptions.nestedtrycatch;

import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {10, 20, 30, 40, 50};

        System.out.print("Enter the index of the element: ");
        int index = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        try {
            int element = array[index];
            try {
                int result = element / divisor;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        } finally {
            System.out.println("Operation completed.");
            scanner.close();
        }
    }
}

