package com.tit.week04.day02.collections.mapinterface.invertmap;

import java.util.*;

public class InvertMap {
    public static <K, V> Map<V, List<K>> invertMap(Map<K, V> inputMap) {
        Map<V, List<K>> invertedMap = new HashMap<>();

        for (Map.Entry<K, V> entry : inputMap.entrySet()) {
            V value = entry.getValue();
            K key = entry.getKey();

            if (!invertedMap.containsKey(value)) {
                invertedMap.put(value, new ArrayList<>());
            }
            invertedMap.get(value).add(key);

        }

        return invertedMap;
    }

    public static void main(String[] args) {
        Map<String, Integer> inputMap = Map.of("A", 1, "B", 2, "C", 1);

        System.out.println("Inverted Map: " + invertMap(inputMap));
    }
}

