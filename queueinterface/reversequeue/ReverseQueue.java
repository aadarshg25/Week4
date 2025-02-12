package com.tit.week04.day02.collections.queueinterface.reversequeue;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {
    public static <T> Queue<T> reverseQueue(Queue<T> queue) {
        if (queue.isEmpty()) { // base case
            return queue;
        }

        T front = queue.remove();
        queue = reverseQueue(queue);
        queue.add(front);

        return queue;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Original Queue: " + queue);
        queue = reverseQueue(queue);
        System.out.println("Reversed Queue: " + queue);
    }
}

