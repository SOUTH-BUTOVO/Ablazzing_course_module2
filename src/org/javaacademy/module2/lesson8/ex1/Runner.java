package org.javaacademy.module2.lesson8.ex1;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10);

        // Filter - Оставляет элементы по условию
        numbers.stream().filter(e -> {
            System.out.println("print: " + e);
            return e > 6;
        }).forEach(e -> System.out.println(e));

        numbers.stream().filter(e -> e > 6).forEach(e -> System.out.print(e + " "));
        System.out.println("\nФильтр чисел которые больше 6.");
        System.out.println("------------");

        // Distinct - Удаление дубликатов
        numbers.stream().distinct().forEach(e -> System.out.print(e + " "));
        System.out.println("\nДистинкт удаление дубликатов");
        System.out.println("------------");

        // Limit - Оставить N элементов
        numbers.stream().limit(5).forEach(e -> System.out.print(e + " "));
        System.out.println("\nЛимит - Оставить N элементов");
        System.out.println("------------");

        // Skip - Пропустить первые N элементов
        numbers.stream().skip(5).forEach(e -> System.out.print(e + " "));
        System.out.println("\nСкип - Пропустить первые N элементов");
        System.out.println("------------");

        // Map - Преобразование каждого элемента в другой элемент
        numbers.stream().map(e -> e + "A").forEach(e -> System.out.print(e + " "));
        System.out.println("\nМап - Преобразование каждого элемента в другой элемент");
        System.out.println("------------");

        // Peek - Действие над элементами
        List<Human> humans = List.of(new Human(20), new Human(30));
        humans.stream().peek(e -> e.setAge(40)).forEach(e -> System.out.print(e + " "));
        System.out.println("\nПик - Действие над элементами");
        System.out.println(humans);
        System.out.println("------------");

        // FlatMap - Устранение вложенности
        List<List<Integer>> listWithLists = List.of(List.of(1, 2, 3), List.of(5, 6), List.of(9));
        List<Integer> integerList = listWithLists.stream().flatMap(e -> e.stream()).toList();
        System.out.println(listWithLists + " Печать листа с вложениями");
        System.out.println(integerList + " Печать листа с удалёнными вложениями");
        System.out.println(listWithLists.get(0) + " Печать первого элемента листа с вложениями");
        System.out.println(integerList.get(0) + " Печать первого элемента листа с удалёнными вложениями");
        System.out.println("\nФлатМап - Устранение вложенности");
        System.out.println("------------");

        // Sorted - Сортировка элементов
        List<Integer> unsortedNumbers = List.of(5, 9, 2, 4, 4);
        System.out.println(unsortedNumbers + "Origin");
        unsortedNumbers.stream().sorted((a, b) -> b - a).forEach(e -> System.out.print(" " + e + " "));
        System.out.println("\nСорт - Сортировка элементов");
        System.out.println("------------");
    }
}
