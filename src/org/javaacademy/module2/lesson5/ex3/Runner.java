package org.javaacademy.module2.lesson5.ex3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Runner {
    public static void main(String[] args) {
        Integer humanHeight1 = 160;
        Integer humanHeight2 = 170;
        Integer humanHeight3 = 180;
        Integer humanHeight4 = 150;

        System.out.println(humanHeight4.compareTo(humanHeight2));

        List<Integer> humans = List.of(humanHeight1, humanHeight2, humanHeight3, humanHeight4);
        System.out.println(humans);

        TreeSet<Integer> treeSet = new TreeSet<>(humans);
        System.out.println(treeSet.descendingSet());

        TreeSet<Student> students = new TreeSet<>(List.of(
                                    new Student(110),
                                    new Student(120),
                                    new Student(130),
                                    new Student(100)
        ));
        System.out.println(students);

        long start = System.currentTimeMillis();
        TreeSet<Integer> integers = new TreeSet<>();
        for (int i = 0; i < 10_000_000; i++) {
            integers.add(i);
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);

        start = System.currentTimeMillis();
        ArrayList<Integer> arrayList = new ArrayList<>(10_000_000);
        for (int i = 0; i < 10_000_000; i++) {
            arrayList.add(i);
        }
        arrayList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
