package org.javaacademy.module2.lesson8.ex2;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Parent parent = new Parent(List.of(new Child("Пётр", 15), new Child("Фёдор", 10)));
        Parent parent2 = new Parent(List.of(new Child("Аня", 2), new Child("Маша", 18)));
        List<Parent> parentList = List.of(parent, parent2);

        parentList.stream().flatMap(e -> e.getChildList().stream())
                .forEach(e -> System.out.println(e));
        System.out.println("----------");

        parentList.stream().map(e -> e.getChildList())
                .forEach(e -> System.out.println(e));
        System.out.println("----------");

        parentList.stream()
                .flatMap(e -> e.getChildList().stream())
                .sorted((a, b) -> a.getAge() - (b.getAge()))
                .forEach(e -> System.out.println(e));
    }
}
