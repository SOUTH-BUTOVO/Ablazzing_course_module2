package org.javaacademy.module2.lesson6.homework3.ex3_burnBright;

import java.util.function.Consumer;

/**
 * Задание №3: Гори ясно!
 * Создать функциональный интерфейс сжигание, ничего не возвращает, принимает аргумент
 * любого типа.
 * Создать класс уран (без атрибутов и методов)
 * Создать класс дерево (без атрибутов и методов)
 * Создать с помощью лямбд выражений:
 * атомный реактор: принимает в себя уран, печатает на экран: зеленый свет вокруг!
 * костер: принимает в себя дерево, печатает на экран: желто-красный свет вокруг!
 */

public class Runner {
    private static final String GREEN_LIGHT = "Зеленый свет вокруг!";
    private static final String YELLOW_RED_LIGHT = "Желто-красный свет вокруг!";

    public static void main(String[] args) {
        Consumer<Uranium> atomicReactor = uran -> System.out.println(GREEN_LIGHT);
        atomicReactor.accept(new Uranium());

        Consumer<Wood> fire = uran -> System.out.println(YELLOW_RED_LIGHT);
        fire.accept(new Wood());
    }
}
