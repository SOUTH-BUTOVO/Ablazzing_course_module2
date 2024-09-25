package org.javaacademy.module2.lesson8.ex4;

import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {

        // Создание объекта класса стрим
        Stream<Integer> stream = Stream.of(1, 2, 3, 5);
        //stream.forEach(e -> System.out.print(e + " "));

        // Объединение стримов в один
        Stream<Integer> stream2 = Stream.of(8, 10, 4);
        Stream.concat(stream, stream2).forEach(e -> System.out.print(e + " "));
    }
}
