package org.javaacademy.module2.lesson3.ex3;

import java.util.LinkedList;

public class Runner {
    public static void main(String[] args) {
        // Реализация DEQUE + QUEUE
        LinkedList<String> linkedList = new LinkedList<>();

        System.out.println("Очередь до наглеца");
        linkedList.add("Бабушка №1");
        linkedList.add("Бабушка №2");
        System.out.println(linkedList);
        System.out.println("---------------");

        System.out.println("Очередь до принятия пациента");
        linkedList.addFirst("Наглый человек");
        System.out.println(linkedList);
        System.out.println("Открывается кабинет");

        System.out.println("Заходит пациент: " + linkedList.pollLast());
        System.out.println("Очередь после захода последнего пациента: " + linkedList);

        linkedList.addFirst(linkedList.pollLast());
        System.out.println(linkedList);

        System.out.println(linkedList.pop());
    }
}
