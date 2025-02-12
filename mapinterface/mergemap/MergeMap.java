package com.tit.week04.day02.collections.mapinterface.mergemap;

import java.util.HashMap;
import java.util.Map;

public class MergeMap {
    public static Map<String, Integer> mergeTwoMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> mergedMap = new HashMap<>(map1);

        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            mergedMap.merge(entry.getKey(), entry.getValue(), (oldValue, newValue) -> oldValue + newValue);
        }

        return mergedMap;
    }

    public static void main(String[] args) {
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2);
        Map<String, Integer> map2 = Map.of("B", 3, "C", 4);

        System.out.println("Merged Map: " + mergeTwoMaps(map1, map2));
    }
}
