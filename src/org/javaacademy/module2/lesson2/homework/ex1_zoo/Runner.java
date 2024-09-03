package org.javaacademy.module2.lesson2.homework.ex1_zoo;

//Задание №1 Зоопарк
//1. Создать три вида животных: Тигр - умеет рычать, Собака - умеет лаять, Птица - умеет летать.
//Общий родитель - животное (никаких атрибутов и методов в нем нет).
//2. Создать зоопарк, который может хранить в себе 3 животных любого типа.
//Т.е. могут быть следующие зоопарки:
// Зоопарк в котором Тигр, Тигр, Птица
// Зоопарк в котором Собака, Собака, Собака
// Зоопарк в котором Птица, Птица, Тигр.
//3. Сделать геттеры на всех животных.
//Сделать так, чтобы при получении животного, мы могли воспользоваться специфичным для него действием.
//Т.е. создали зоопарк Тигр, Собака, Птица (положили в этот зоопарк животных  при создании).
//Получили первое животное (тигра) - вызвали у него рык
//Получили второе животное (собака) - вызвали у него лай
//Получили первое животное (птица) - вызвали у него полет
//Запрещено пользоваться instanceOf.

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        Tiger tiger = new Tiger();
        Dog dog = new Dog();
        Bird bird = new Bird();

//        Zoo<Animal> animalZoo = new Zoo<>(new Tiger(), dog, bird);
//        animalZoo.getAnimal1();
//        animalZoo.getAnimal2();
//        animalZoo.getAnimal3();
//        System.out.println(animalZoo.getAnimal1());

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(tiger);

        Zoo<Animal> animalZoo = new Zoo<>(animals);

    }
}
