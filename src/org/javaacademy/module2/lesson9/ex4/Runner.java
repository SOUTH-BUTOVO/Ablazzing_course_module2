package org.javaacademy.module2.lesson9.ex4;

import java.util.Comparator;
import java.util.TreeMap;

public class Runner {
    public static void main(String[] args) {
        TreeMap<String, Integer> products = new TreeMap<>(Comparator.comparingInt(String::length)
                .thenComparing(String::hashCode));
        Shop shop = new Shop(products);
        shop.addProduct("Яблоки", 10);
        shop.addProduct("Яблоки", 20);
        shop.addProduct("Финики", 20);
        shop.addProduct("Апельсины", 20);

        shop.getProducts().forEach((k, v) -> System.out.println(k + " " + v));

        System.out.println(shop);
    }
}
