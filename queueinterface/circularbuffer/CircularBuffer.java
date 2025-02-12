package com.tit.week04.day02.collections.queueinterface.circularbuffer;

class CircularBuffer {
    private int[] buffer;
    private int head;
    private int tail;
    private int size;
    private int capacity;

    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        this.buffer = new int[capacity];
        this.head = 0;
        this.tail = 0;
        this.size = 0;
    }

    public void insert(int value) {
        if (size == capacity) {
            head = (head + 1) % capacity; // Overwrite the oldest element
        } else {
            size++;
        }
        buffer[tail] = value;
        tail = (tail + 1) % capacity;
    }

    public void display() {
        System.out.print("Buffer: [");
        for (int i = 0; i < size; i++) {
            System.out.print(buffer[(head + i) % capacity]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.display();
        cb.insert(4);
        cb.display();
    }
}

