package org.javaacademy.module2.lesson7.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        List<String> names = List.of("Пётр", "Ян", "Михаил", "Иван");
        Stream<String> stream = names.stream();

        //stream.forEach(e -> System.out.println()); // 1й способ
        Stream.of(stream); // 2й способ
        Stream.of("Пётр", "Иван", "Олег"); // 2й способ
        Stream.of(new String[]{"Пётр", "Иван", "Олег"}); // 3й способ

        ArrayList<String> newNames = new ArrayList<>();
        // Добавить имена в newName
//        stream.forEach(e -> newNames.add(e));
        stream.filter(e -> e.length() > 4).forEach(e -> System.out.println(e));
        System.out.println("------------");

        System.out.println(names.stream().count());

        System.out.println(names.stream().anyMatch(e -> e.equals("Михаил")));

        System.out.println(names.stream().allMatch(("Пётр" + "Иван" + "Михаил")::equals));

        System.out.println(names.stream().noneMatch(("Пётр")::equals));

        System.out.println(names.stream().anyMatch(e -> e.toLowerCase().contains("м")));

        // Получить первый элемент из стрима
        System.out.println(names.stream().findFirst());

        System.out.println(names.stream().max((a, b) -> a.length() - b.length()).orElse("Нет такого имени!"));
        System.out.println(names.stream().min((a, b) -> a.length() - b.length()).orElse("Нет такого имени!"));

        // Получение одного сгруппированного значения
        String reduce = names.stream().reduce("", (a, b) -> "%s, %s".formatted(a, b));
        System.out.println(reduce);
        System.out.println(names.stream().reduce((a, b) -> "%s, %s".formatted(a, b)).orElseThrow());

        List<Integer> numbers = List.of(10, 20, 30);
        System.out.println(numbers.stream().reduce((a, b) -> (a + b) * 2).orElseThrow());
        System.out.println(numbers.stream().map(e -> String.valueOf(e))
                .reduce((a, b) -> "%s, %s".formatted(a, b)).orElseThrow());

        System.out.println(numbers.stream().map(e -> String.valueOf(e)).collect(Collectors.joining(", ")));
    }
}
