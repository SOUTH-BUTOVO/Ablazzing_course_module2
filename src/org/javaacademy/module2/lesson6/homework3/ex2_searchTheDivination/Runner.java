package org.javaacademy.module2.lesson6.homework3.ex2_searchTheDivination;

import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * Задание №2: Поиск пары с помощью гадания
 * Создать функциональный интерфейс гадание, который на вход принимает аргумент любого типа,
 * на выход возвращает да/нет.
 * Создать с помощью лямбд выражений:
 * ромашку: принимает имя, возвращает да если в имени четное кол-во букв, нет если нечетное
 * бабку гадалку: принимает Человека(возраст, рост),
 * возвращает да - если (возраст + рост) больше 210, нет - если меньше или равно
 */

public class Runner {
    private static final Integer AGE_AND_HEIGHT = 210;
    private static final Integer ZERO = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divinationByChamomile(scanner);
        divinationByGrandma(scanner);

        scanner.close();
    }

    private static void divinationByGrandma(Scanner scanner) {
        System.out.println("Введите ваш возраст, для гадания бабке:");
        int myAge = scanner.nextInt();
        System.out.println("Введите ваш рост, для гадания бабке:");
        int myHeight = scanner.nextInt();
        BiPredicate<Integer, Integer> divinationByGrandma = (age, height) -> age + height > AGE_AND_HEIGHT;
        boolean resultDivination = divinationByGrandma.test(myAge, myHeight);
        System.out.println(resultDivination ? "Да!" : "Нет.");
    }

    private static void divinationByChamomile(Scanner scanner) {
        System.out.println("Введите ваше имя, для гадания на ромашке:");
        String myName = scanner.nextLine();
        Predicate<String> divinationByChamomile = name -> name.length() % 2 == ZERO;
        boolean resultDivination = divinationByChamomile.test(myName);
        System.out.println(resultDivination ? "Да!" : "Нет.");
    }
}
