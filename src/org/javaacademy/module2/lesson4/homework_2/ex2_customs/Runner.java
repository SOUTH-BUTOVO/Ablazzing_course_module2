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

import static org.javaacademy.module2.lesson4.homework_2.ex2_customs.LuggageCategory.*;

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

        Path pathBaggage = Path.of("resources/luggage.csv"); // Путь файла хранения прибывшего багажа
        try (BufferedReader reader = Files.newBufferedReader(pathBaggage)) { // Считываем файл
            reader.readLine(); // Пропускаем первую строку "Заголовок"

            String baggageAndWeight; // Строка № багажа ; вес багажа, не обрезанная
            Integer baggage = 0; // Вес багажа добавляемый в baggageWeight

            while ((baggageAndWeight = reader.readLine()) != null) {
                int indexEnd = baggageAndWeight.indexOf(DELIMITER) + 1;
                baggage = Integer.parseInt(baggageAndWeight.substring(indexEnd));
                if (baggage < LIGHT.getMaxLimit()) {
                    baggageWeight.put(LIGHT.getName(), baggageWeight.getOrDefault(LIGHT.getName(), 0) +
                            baggage);
                } else if (baggage < MIDDLE.getMaxLimit()) {
                    baggageWeight.put(MIDDLE.getName(), baggageWeight.getOrDefault(MIDDLE.getName(), 0) +
                            baggage);
                } else {
                    baggageWeight.put(HEAVY.getName(), baggageWeight.getOrDefault(HEAVY.getName(), 0) +
                            baggage);
                }
            }
            for (int i = 0; i < values().length; i++) {
                LuggageCategory category = values()[i];
                int limit = category.getMaxLimit() == null ? Integer.MAX_VALUE : category.getMaxLimit();
                if (baggage < limit) {
                    baggageWeight.put(category.getName(), baggageWeight.getOrDefault(category.getName(), 0)
                            + baggage);
                    break;
                }
            }
        }
        return baggageWeight; // Возвращаем мапу с заполненной статистикой веса багажа
    }
}
