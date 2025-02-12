package com.tit.week04.day02.collections.listinterface.nthfromend;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class NthFromEnd {
    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {
        if (list == null || n <= 0) {
            throw new IllegalArgumentException("Invalid input: List cannot be null and N must be greater than 0");
        }
        //same as slow and fast pointer
        ListIterator<T> first = list.listIterator();
        ListIterator<T> second = list.listIterator();


        for (int i = 0; i < n; i++) {
            if (!first.hasNext()) {
                throw new IllegalArgumentException("N is larger than the size of the list");
            }
            first.next();
        }


        while (first.hasNext()) {
            first.next();
            second.next();
        }

        return second.next();
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(List.of("A", "B", "C", "D", "E"));
        int n = 2;

        System.out.println("Nth element from end: " + findNthFromEnd(list, n)); // Output: D
    }
}

