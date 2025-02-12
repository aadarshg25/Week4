package com.tit.week04.day02.collections.queueinterface.binarynumbergenerator;
import java.util.*;

public class BinaryNumberGenerator {
    public static List<String> generateBinaryNumbers(int n) {
        List<String> binaryNumbers = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        queue.add("1"); // Start with "1"

        for (int i = 0; i < n; i++) {
            String front = queue.remove(); // Remove the front element
            binaryNumbers.add(front); // Add to result list

            // Generate next two binary numbers
            queue.add(front + "0");
            queue.add(front + "1");
        }

        return binaryNumbers;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("First " + n + " Binary Numbers: " + generateBinaryNumbers(n));
    }
}

