package com.tit.week04.day06.annotations.advancedlevel.jsonfield;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        User user = new User("Alice", 25);
        System.out.println(user.toJson());
    }
}
