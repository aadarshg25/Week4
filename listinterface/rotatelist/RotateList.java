package com.tit.week04.day02.collections.listinterface.rotatelist;

import java.util.ArrayList;
import java.util.List;
public class RotateList {
    public static <T> void rotateList(List<T> list, int positions) {
        int size = list.size();
        if (size == 0 || positions % size == 0) return;

        positions = positions % size;
        List<T> temp = new ArrayList<>(list.subList(0, positions));
        list.removeAll(temp);
        list.addAll(temp);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(10, 20, 30, 40, 50));
        System.out.println("Original List: " + list);

        rotateList(list, 2);
        System.out.println("Rotated List: " + list);
    }
}

