package com.tit.week04.day06.annotations.exercise.customannotation;

public class TaskManager {
    @TaskInfo(priority = "High", assignedTo = "Alice")
    public void completeTask() {
        System.out.println("Task completed");
    }
}
