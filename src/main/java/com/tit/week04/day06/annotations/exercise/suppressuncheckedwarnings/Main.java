package com.tit.week04.day06.annotations.exercise.suppressuncheckedwarnings;

import java.util.ArrayList;

public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Item 1");
        list.add("Item 2");
        System.out.println("List: " + list);
    }
}

