package com.tit.week04.day02.collections.mapinterface.wordfrequencycounter;

import java.io.*;
import java.util.*;

public class WordFrequencyCounter {
    public static Map<String, Integer> countWordFrequency(String filePath) {
        Map<String, Integer> wordCountMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Convert to lowercase and remove punctuation
                line = line.replaceAll("[^a-zA-Z ]", "").toLowerCase();
                String[] words = line.split("\\s+"); // Split by whitespace

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return wordCountMap;
    }

    public static void main(String[] args) {
        String filePath = "Hello.txt";
        Map<String, Integer> wordFrequency = countWordFrequency(filePath);

        System.out.println("Word Frequency: " + wordFrequency);
    }
}
