package org.javaacademy.module2.lesson4.homework_2.ex1_loaders;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Airport {
    private static final int MAX_SIZE_BAGGAGE_TAPE = 10; // Вмещаемое кол-во багажа на ленте выдачи
    private static final String DELIMITER = ";";
    private static final int NULL = 0;
    private Queue<String> queue = new LinkedList<>();
    private Path pathBaggage = Path.of("resources/luggage.csv"); // Путь файла хранения прибывшего багажа

    // Хранение и отправка багажа на ленту выдачи, очередью по MAX_SIZE_BAGGAGE_TAPE
    protected void baggageStorageArea() throws IOException {
        BufferedReader reader = Files.newBufferedReader(pathBaggage); // Считываем файл
        reader.readLine(); // Пропускаем первую строку "Заголовок"
        String baggageAndWeight; // Строка № багажа ; вес багажа, не обрезанная
        String numBaggage; // № багажа добавляемый в очередь
        int countBaggage = NULL; // Очередь багажа на ленту

        // Берём 10 строк № багажа, создаём очередь
        while (countBaggage < MAX_SIZE_BAGGAGE_TAPE &&
              (baggageAndWeight = reader.readLine()) != null) {
            int indexEnd = baggageAndWeight.indexOf(DELIMITER);
            numBaggage = baggageAndWeight.substring(NULL, indexEnd);
            queue.add(numBaggage);
            countBaggage++;

            // Если очередь собрана, отправляем в метод на ленту выдачи
            while (countBaggage == MAX_SIZE_BAGGAGE_TAPE || (countBaggage > 0 && !reader.ready())) {
                unloadingTape(queue); // Отправляем в метод на ленту выдачи
                queue.clear(); // Очищаем очередь
                countBaggage = NULL; // Сбрасываем счётчик
            }
        }

        reader.close(); // Закрываем BufferedReader
    }

    private void unloadingTape(Queue<String> queue) {
        int sizeTape = queue.size();
        if (!queue.isEmpty()) {
            System.out.println("Начинается загрузка на ленту");
            System.out.println("Лента загружена на " + queue.size() + " чемоданов, начинается выдача багажа");

            // i < queue.size() не понятно почему но, отрабатывает только 5 первых элементов.
            for (int i = 0; i < sizeTape; i++) {
                String poll = queue.poll();
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println(poll + " - Выдан");
            }
            System.out.println("Лента пустая, закончена выдача багажа");
            System.out.println("----------------");
        }
    }
}
