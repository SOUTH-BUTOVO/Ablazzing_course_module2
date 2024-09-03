package org.javaacademy.module2.lesson2.collection_method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        String[] names = {"Пётр", "Юрий", "Олег"};
        String[] namesBigger = new String[names.length + 1];

        for (int i = 0; i < names.length; i++) {
            namesBigger[i] = names[i];
        }
        namesBigger[names.length] = "Иван";
            System.out.println(Arrays.toString(namesBigger));

        ArrayList<String> namesList = new ArrayList<>(List.of(names));
        namesList.add("Иван");
        System.out.println(namesList);

        for (String name : namesList) {
            System.out.println(name);
        }
        System.out.println("---------------------");

        ArrayList<Integer> integers = new ArrayList<>(List.of(1, 2, 3, 4, 10));
        System.out.println("Размер: " + integers.size());
        System.out.println("Пустой ли список: " + integers.isEmpty());
        System.out.println("Пустой ли какое то значение: " + integers.contains(4));

        Integer[] array = integers.toArray(new Integer[0]);
        System.out.println(Arrays.toString(array));

        // Добавление нового элемента
        integers.add(0, 11);
        System.out.println(integers);

        // Удаление элемента
        Integer integer = integers.remove(0);
        Boolean success = integers.remove(Integer.valueOf(12));
        integers.remove(Integer.valueOf(4));
        System.out.println(integers);
        System.out.println(success);

        boolean containsAll = integers.containsAll(List.of(1, 2, 10));
        System.out.println("Содержит в себе список числа (1, 2, 10): " + containsAll); // В любом порядке

        // Добавить множество
        integers.addAll(List.of(1, 2, 3, 4, 5));
        System.out.println(integers);

        // Удалить все вхождения чисел
        integers.removeAll(List.of(1, 2, 3, 4, 5));
        System.out.println(integers);

        // Пересечение значений
        ArrayList<Integer> firstList = new ArrayList<>(List.of(1, 5, 6, 7));
        ArrayList<Integer> secondList = new ArrayList<>(List.of(2, 5, 7, 10));
        firstList.retainAll(secondList);
        System.out.println(firstList);

        // Удаление всех элементов из коллекции
        integers.clear();
        System.out.println(integers);
    }
}
