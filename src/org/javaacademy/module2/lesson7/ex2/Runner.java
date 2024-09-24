package org.javaacademy.module2.lesson7.ex2;

import java.util.List;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        List<String> names = List.of("Пётр", "Иван", "Олег");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("----");

        names.stream().forEach(e -> System.out.println(e));
        System.out.println("----");

        names.stream()
                .filter(e -> e.substring(0, 1).equals("И"))
                .forEach(e -> System.out.println(e));
        System.out.println("----");

        Stream.of("Андрей".split("")).forEach(e -> System.out.println(e));
        System.out.println("----");
    }
}
