package com.tit.week04.day02.collections.listinterface.frequencyofelements;

import java.util.*;

public class FrequencyOfElements {
    public static Map<String, Integer> countFrequency(List<String> list) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String item : list) {
            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        }

        return frequencyMap;
    }

    public static void main(String[] args) {
        List<String> inputList = new ArrayList<>();
        inputList.add("apple");
        inputList.add("banana");
        inputList.add("apple");
        inputList.add("orange");

        Map<String, Integer> frequency = countFrequency(inputList);

        System.out.println("Frequency of elements: " + frequency);
    }
}

