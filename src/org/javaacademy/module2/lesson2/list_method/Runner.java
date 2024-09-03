package org.javaacademy.module2.lesson2.list_method;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(List.of("Петр", "Дима", "Иван"));
        System.out.println("Получение элемента под индексом 1: " + strings.get(0));

        strings.set(2, "Юрий");
        System.out.println(strings);

        System.out.println("Индекс Петра: " + strings.indexOf("Петр"));

        List<String> subList = strings.subList(0, 2);
//        List<String> subList = new ArrayList<>(strings.subList(0, 2));
        System.out.println(subList);
        subList.set(0, "Женя");
        System.out.println(strings);

        List<String> list = List.of("Гена");
//        list.set(0, "Гена");
        ArrayList<String> list2 = new ArrayList<>(list);
        list2.set(0, "Oleg");
        System.out.println(list2);
    }
}
