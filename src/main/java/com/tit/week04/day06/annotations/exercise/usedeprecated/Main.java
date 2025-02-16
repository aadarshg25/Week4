package com.tit.week04.day06.annotations.exercise.usedeprecated;

public class Main {
    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();
        api.oldFeature(); // This should show a warning
        api.newFeature();
    }
}
