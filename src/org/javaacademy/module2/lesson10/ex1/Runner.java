package org.javaacademy.module2.lesson10.ex1;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        List<Cola> colas = List.of(new Cola(20));
        Storage storage = new Storage(colas);
        storage.addProduct(new Juice(30));

        System.out.println(storage.getProductByIndex(0));
        System.out.println(storage.getProductByIndex(0).getPrice());
        System.out.println(storage.getProductByIndex(1));
        System.out.println(storage.getProductByIndex(1).getPrice());

        // PECS
        // PE - PRODUCER EXTENDS
        // CS - CONSUMER SUPER

        // Это консьюмер
        Consumer<? super Cola> consumer = e -> e.open();
        consumer.accept(new Cola(25));

        // Это продюсер
        Stream.generate(() -> new Cola(26));

//        colas.stream().forEach();
    }
}
