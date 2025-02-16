package com.tit.week04.day06.reflection.intermediatelevel.dynamicmethodinvocation;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        MathOperations operations = new MathOperations();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter method name (add, subtract, multiply): ");
        String methodName = scanner.nextLine();
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        Method method = MathOperations.class.getMethod(methodName, int.class, int.class);
        int result = (int) method.invoke(operations, num1, num2);

        System.out.println("Result: " + result);
    }
}
