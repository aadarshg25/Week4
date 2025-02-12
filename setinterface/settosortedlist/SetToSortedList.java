package com.tit.week04.day02.collections.setinterface.settosortedlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetToSortedList {
    public static List<Integer> convertToSortedList(Set<Integer> set) {
        return new ArrayList<>(new TreeSet<>(set)); // TreeSet automatically sorts in ascending order
    }

    public static void main(String[] args) {
        Set<Integer> inputSet = Set.of(5, 3, 9, 1);
        System.out.println("Sorted List: " + convertToSortedList(inputSet));
    }
}

