package org.javaacademy.module2.lesson6.homework3.ex4_universalRuler;

import java.util.function.Function;

/**
 * Задание №4: универсальная линейка
 * Создать функциональный интерфейс линейка: принимает в себя любой тип, возвращает Integer
 * Создать класс животное (длина тела, длина хвоста)
 * Создать класс лодка(длина)
 * Создать с помощью лямбд выражений:
 * Измеритель лодок: на вход лодка, возвращает длину лодки
 * Измеритель животных: на вход животное, возвращает сумму длин тела и хвоста
 */

public class Runner {
    public static void main(String[] args) {
        rulerBoat();
        rulerAnimal();
    }

    private static void rulerBoat() {
        Function<Boat, Integer> ruler2 = boat -> boat.getBoatLength();
        Integer boatLength = ruler2.apply(new Boat(300));
        System.out.println(boatLength);
    }

    private static void rulerAnimal() {
        Function<Animal, Integer> ruler1 = animal -> animal.getBodyLength() + animal.getTailLength();
        Integer animalLength = ruler1.apply(new Animal(100, 30));
        System.out.println(animalLength);
    }
}
