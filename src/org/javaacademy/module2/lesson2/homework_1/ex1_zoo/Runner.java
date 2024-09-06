package org.javaacademy.module2.lesson2.homework_1.ex1_zoo;

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

import org.javaacademy.module2.lesson2.homework_1.ex1_zoo.animal.*;

public class Runner {
    public static void main(String[] args) {

        Tiger tiger = new Tiger();
        Dog dog = new Dog();
        Bird bird = new Bird();

        Zoo<Tiger, Dog, Bird> animalZoo = new Zoo<>(tiger, dog, bird);

        System.out.println(animalZoo.getAnimal1());
        animalZoo.voiceTiger();
        //org.javaacademy.module2.lesson2.homework.ex1_zoo.animal.Tiger@4c873330
        //Тигр рычит

        System.out.println(animalZoo.getAnimal2());
        animalZoo.voiceDog();
        //org.javaacademy.module2.lesson2.homework.ex1_zoo.animal.Dog@119d7047
        //Собака гав-гав

        System.out.println(animalZoo.getAnimal3());
        animalZoo.flyBird();
        //org.javaacademy.module2.lesson2.homework.ex1_zoo.animal.Bird@776ec8df
        //Птица летит
    }
}
