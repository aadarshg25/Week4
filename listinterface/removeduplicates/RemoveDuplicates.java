package com.tit.week04.day02.collections.listinterface.removeduplicates;
import java.util.*;

public class RemoveDuplicates {
    public static <T> List<T> removeDuplicates(List<T> list) {
        Set<T> seen = new HashSet<>();
        List<T> result = new ArrayList<>();

        for (T item : list) {
            boolean isNewElement = seen.add(item);
            if (isNewElement) {
                result.add(item);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>(List.of(3, 1, 2, 2, 3, 4));
        System.out.println("Original List: " + inputList);

        List<Integer> uniqueList = removeDuplicates(inputList);
        System.out.println("List after removing duplicates: " + uniqueList);
    }
}

