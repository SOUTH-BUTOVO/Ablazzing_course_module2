package org.javaacademy.module2.lesson5.ex4;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(170, "Иванов");
        treeMap.put(167, "Петров");
        treeMap.put(180, "Сидоров");
        System.out.println(treeMap);
        System.out.println(treeMap.firstKey());
        System.out.println(treeMap.lastKey());

        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(170, "Иванов");
        linkedHashMap.put(167, "Петров");
        linkedHashMap.put(180, "Сидоров");
        System.out.println(linkedHashMap);
        System.out.println("-----");

        for (Integer key : linkedHashMap.keySet()) {
            System.out.println(key);
        }
        System.out.println("-----");
        for (String value : linkedHashMap.values()) {
            System.out.println(value);
        }
        System.out.println("-----");
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        System.out.println("-----");

        System.out.println(linkedHashMap.keySet());
        System.out.println(linkedHashMap.values());
        System.out.println(linkedHashMap.entrySet());
    }
}
