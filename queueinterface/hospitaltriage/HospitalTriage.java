package com.tit.week04.day02.collections.queueinterface.hospitaltriage;

import java.util.PriorityQueue;

public class HospitalTriage {
    public static void main(String[] args) {
        // Max-Heap PriorityQueue: Higher severity patients come first
        PriorityQueue<Patient> queue = new PriorityQueue<>((p1, p2) -> Integer.compare(p2.severity, p1.severity));

        // Adding patients
        queue.add(new Patient("John", 3));
        queue.add(new Patient("Alice", 5));
        queue.add(new Patient("Bob", 2));

        // Processing patients
        System.out.println("Order of Treatment:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
