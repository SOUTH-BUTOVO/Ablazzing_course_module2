package org.javaacademy.module2.lesson4.ex2;

import java.util.HashMap;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        String studentName = "Ivanov George";
        String studentName2 = "Masha Petrova";
        Integer score = 5;
        Integer score2 = 3;

        HashMap<String, Integer> scores = new HashMap<>();
        scores.put(studentName, score);
        scores.put(studentName2, score2);
        scores.put("Ivanov George", 2);
        scores.put(null, null);

        System.out.println(scores);
        System.out.println("---------------------");

        System.out.println(Map.of("Ivanov George", 4,
                                  "Masha Petrova", 5));

        HashMap<Integer, Integer> scores2 = new HashMap<>();
        scores2.put(null, 1);
        scores2.put(0, 2);
        System.out.println(scores2);

        System.out.println(scores.get("Ivanov George"));
    }
}
