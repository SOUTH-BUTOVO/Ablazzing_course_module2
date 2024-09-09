package org.javaacademy.module2.lesson4.homework_2.ex2_customs;

//2. Задание: Таможня в Болгарии
//Таможня собирает статистику о весе ввезенных чемоданов.
//Есть 3 категории чемоданов: легкий (до 5 кг), средний (от 5 кг до 10кг), тяжелый (от 10 кг)
//Необходимо создать метод, который:
//считывает файл с багажом, суммирует вес по каждой категории и возвращает сгруппированные данные
//т.е метод должен вернуть данные (не распечатать), в которых будет инфо:
//категория чемодана - сумма всех чемоданов этой категории

//Пример возврата:
//легкий - 205
//средний - 513
//тяжелый - 1200

//Протестировать функцию на файле luggage.csv.

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class Runner {
    private static final String DELIMITER = ";";

    public static void main(String[] args) {
        try {
            System.out.println(customs()); // {Средний чемодан=61, Лёгкий чемодан=38, Тяжёлый чемодан=364}
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static Map<String, Integer> customs() throws IOException {
        // Создаём мапу для хранения статистики веса ввезенных чемоданов
        Map<String, Integer> baggageWeight = new HashMap<>();
        baggageWeight.put("Лёгкий чемодан", 0); // Создаём статистику по лёгким чемоданам
        int lightWeight = 0;
        baggageWeight.put("Средний чемодан", 0); // Создаём статистику по средним чемоданам
        int mediumWeight = 0;
        baggageWeight.put("Тяжёлый чемодан", 0); // Создаём статистику по тяжёлым чемоданам
        int heavyWeight = 0;

        Path pathBaggage = Path.of("resources/luggage.csv"); // Путь файла хранения прибывшего багажа
        try (BufferedReader reader = Files.newBufferedReader(pathBaggage)) { // Считываем файл
            reader.readLine(); // Пропускаем первую строку "Заголовок"

            String baggageAndWeight; // Строка № багажа ; вес багажа, не обрезанная
            Integer baggage; // Вес багажа добавляемый в baggageWeight

            while ((baggageAndWeight = reader.readLine()) != null) {
                int indexEnd = baggageAndWeight.indexOf(DELIMITER) + 1;
                baggage = Integer.parseInt(baggageAndWeight.substring(indexEnd));
                if (baggage < 5) {
                    lightWeight += baggage;
                    baggageWeight.put("Лёгкий чемодан", lightWeight); // Добавляем в мапу значение, по ключу
                } else if (baggage >= 5 && baggage < 10) {
                    mediumWeight += baggage;
                    baggageWeight.put("Средний чемодан", mediumWeight); // Добавляем в мапу значение, по ключу
                } else {
                    heavyWeight += baggage;
                    baggageWeight.put("Тяжёлый чемодан", heavyWeight); // Добавляем в мапу значение, по ключу
                }
            }
        }
        return baggageWeight; // Возвращаем мапу с заполненной статистикой веса багажа
    }
}
