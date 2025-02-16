package com.tit.week04.day06.annotations.beginnerlevel.todo;

public class TaskManager {
    @Todo(task = "Implement logging", assignedTo = "Alice", priority = "HIGH")
    public void logTask() {
        System.out.println("Logging task");
    }

    @Todo(task = "Optimize performance", assignedTo = "Bob")
    public void optimizeTask() {
        System.out.println("Optimizing task");
    }
}

