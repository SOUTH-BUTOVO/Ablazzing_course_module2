package org.javaacademy.module2.lesson4.ex3;

import java.util.HashMap;

public class Runner {
    public static void main(String[] args) {
        Child child1 = new Child("Иванов", "Иван", 1990);
        Child child2 = new Child("Иванов", "Иван", 1991);

        HashMap<Child, Integer> map = new HashMap<>();
        map.put(child1, 10);
        map.put(child2, 12);

        System.out.println(map);
    }
}
