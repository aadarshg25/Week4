package com.tit.week04.day05.junit.basicjunit.performancetimeout;

public class PerformanceTimeout {
    public String longRunningTask() throws InterruptedException {
        Thread.sleep(3000);
        return "Task Completed";
    }
}