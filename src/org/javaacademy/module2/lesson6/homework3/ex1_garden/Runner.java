package org.javaacademy.module2.lesson6.homework3.ex1_garden;

import org.javaacademy.module2.lesson6.homework3.ex1_garden.fruit.Apple;
import org.javaacademy.module2.lesson6.homework3.ex1_garden.fruit.Apricot;
import org.javaacademy.module2.lesson6.homework3.ex1_garden.fruit.Fruit;

/** Задание №1: Сад
 Создать два класса, которые являются фруктами (намек на еще один класс): яблоко, абрикос.
 (Без полей и методов).
 Создать функциональный интерфейс сад, который умеет выращивать ФРУКТ и всех наследников фрукта.
 Метод ничего не принимает.
 Создать с помощью лямбд выражений 2 фермы: яблочная, абрикосовая.
 Яблочная ферма должна отдавать яблоко(не фрукт!), абрикосовая - абрикос(не фрукт!). */

public class Runner {
    public static void main(String[] args) {
        Garden appleFunctional = () -> new Apple();
        Fruit apple = appleFunctional.fruitCultivation();
        System.out.println(apple);

        Garden apricotFunctional = () -> new Apricot();
        Fruit apricot = apricotFunctional.fruitCultivation();
        System.out.println(apricot);
    }
}
