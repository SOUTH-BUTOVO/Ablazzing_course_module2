package org.javaacademy.module2.lesson3.ex2;

import java.util.concurrent.ArrayBlockingQueue;

public class Runner {
    public static void main(String[] args) {
        // Очередь! Интерфейс QUEUE
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<String>(100);
        queue.add("Бабушка №1");
        queue.add("Бабушка №2");
        String peek = queue.peek(); // Получить первый элемент в очереди
        String poll = queue.poll(); // Получить первый в очереди элемент и удалить его из Коллекции

        System.out.println(poll);
        System.out.println(peek);
        System.out.println(queue);
        // first in first out - fifo - первый зашёл (пришёл/добавился), первый вышел
    }
}
