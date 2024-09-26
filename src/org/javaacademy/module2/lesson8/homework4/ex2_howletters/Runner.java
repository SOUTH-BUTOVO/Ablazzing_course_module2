package org.javaacademy.module2.lesson8.homework4.ex2_howletters;

import java.util.Set;
import java.util.regex.Pattern;

/**
 * Задание №2 - Сколько здесь "о" ?
 * 1. Создать набор уникальных слов: "тон", "тополь", "боль", "рой", "стройка"
 * 2. Создать стрим у набора
 * 2.1 Посчитать количество букв "о" в одном слове
 * 2.2 Посчитать сумму количества букв "о" во всех словах из набора
 * 2.3 Вывести на экран сумму букв "о". Если в словах нет буквы "о", то распечатать ноль.
 * //
 * ожидаемый результат:
 * 6
 */

public class Runner {
    public static void main(String[] args) {
        Set<String> words = Set.of("тон", "тополь", "боль", "рой", "стройка", "лес");
        words.stream()
                .peek(word -> System.out.print("Количество букв \"о\" в слове: "))
                .map(word -> {
                    // Получаем поток символов слова, фильтруем символы и подсчитываем
                    long count = word.chars().filter(letter -> letter == 'о').count();
                    return word + " = " + count;
                })
                .forEach(e -> System.out.println(e));

        long countLetter = words.stream()
                .flatMapToInt(string -> string.chars())
                .filter(letter -> letter == 'о')
                .count();
        System.out.println("\nСумма букв 'о' в коллекции: " + countLetter);
    }
}
