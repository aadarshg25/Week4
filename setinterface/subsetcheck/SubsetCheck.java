package com.tit.week04.day02.collections.setinterface.subsetcheck;

import java.util.Set;

public class SubsetCheck {
    public static <T> boolean isSubset(Set<T> subset, Set<T> superset) {
        return superset.containsAll(subset);
    }

    public static void main(String[] args) {
        Set<Integer> set1 = Set.of(2, 3);
        Set<Integer> set2 = Set.of(1, 2, 3, 4);

        System.out.println("Is Set1 a subset of Set2? " + isSubset(set1, set2));
    }
}

