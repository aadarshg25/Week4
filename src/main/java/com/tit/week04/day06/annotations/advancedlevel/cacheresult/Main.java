package com.tit.week04.day06.annotations.advancedlevel.cacheresult;

public class Main {
    public static void main(String[] args) throws Exception {
        ExpensiveService service = new ExpensiveService();
        System.out.println("Result: " + service.computeSquare(5));
        System.out.println("Result: " + service.computeSquare(5));
        System.out.println("Result: " + service.computeSquare(3));
        System.out.println("Result: " + service.computeSquare(3));
    }
}
