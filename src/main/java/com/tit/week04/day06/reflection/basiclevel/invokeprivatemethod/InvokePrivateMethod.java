package com.tit.week04.day06.reflection.basiclevel.invokeprivatemethod;

import java.lang.reflect.Method;

public class InvokePrivateMethod {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        try {
            Method multiplyMethod = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
            multiplyMethod.setAccessible(true);

            int result = (int) multiplyMethod.invoke(calculator, 5, 3);
            System.out.println("Result of multiply: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}