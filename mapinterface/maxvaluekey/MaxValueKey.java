package com.tit.week04.day02.collections.mapinterface.maxvaluekey;

import java.util.Map;

public class MaxValueKey {
    public static String findKeyWithMaxValue(Map<String, Integer> map) {
        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        return maxKey;
    }

    public static void main(String[] args) {
        Map<String, Integer> inputMap = Map.of("A", 10, "B", 20, "C", 15);
        System.out.println("Key with the Highest Value: " + findKeyWithMaxValue(inputMap));
    }
}

