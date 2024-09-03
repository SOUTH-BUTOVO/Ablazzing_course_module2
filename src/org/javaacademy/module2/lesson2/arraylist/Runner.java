package org.javaacademy.module2.lesson2.arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(0, 17);

        int [] ints = {16, 10, 5, 4, 2, 1, 15};
        integers.set(0, 16);
        ints[0] = 17;

        System.out.println(integers.size());
        integers.add(20);
        System.out.println(integers);

        long startTime = System.currentTimeMillis();
        ArrayList<Integer> integers1 = new ArrayList<>(List.of(1, 2, 3));
        List<Integer> list = new LinkedList<>(integers1);
        list.addAll(integers1);
        for (int i = 0; i < 1_000_000; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime));
    }
}
