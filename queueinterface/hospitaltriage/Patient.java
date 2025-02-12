package com.tit.week04.day02.collections.queueinterface.hospitaltriage;

public class Patient {
    public String name;
    public int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    @Override
    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}
