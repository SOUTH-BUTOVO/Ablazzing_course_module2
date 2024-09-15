package org.javaacademy.module2.lesson6.ex3;

import java.util.function.Predicate;

public class Runner {
    public static void main(String[] args) {

        MathOperation plusOperation = (num1, num2) -> {
            System.out.println("plus numbers:");
            return num1 + num2;
        };
        System.out.println(plusOperation.makeOperation(2, 3));

        MathOperation subtractOperation = (num1, num2) -> {
            System.out.println("minus numbers:");
            return num1 - num2;
        };
        System.out.println(subtractOperation.makeOperation(8, 3));

        MathOperation separationOperation = (num1, num2) -> {
            System.out.println("separation numbers");
            return num1 / num2;
        };
        System.out.println(separationOperation.makeOperation(10, 2));

        MathOperation multiplyOperation = (num1, num2) -> {
            System.out.println("multiply numbers");
            return num1 * num2;
        };
        System.out.println(multiplyOperation.makeOperation(2, 3));
        System.out.println("--------");

        NumberChecker isEvenChecker = num -> num % 2 == 0;
        System.out.println(isEvenChecker.check(25) ? "Число чётное" : "Число не чётное");

        Predicate<Double> isEvenCheckerPredicate = num -> num % 2 == 0;
        System.out.println(isEvenCheckerPredicate.test(18d) ? "Число чётное" : "Число не чётное");

        NumberChecker isMoreChecker = num -> num >= 10;
        System.out.println(isMoreChecker.check(10) ? "Число больше или равно 10" : "Число меньше 10");

        Predicate<Double> isMoreCheckerPredicate = num -> num >= 10;
        System.out.println(isMoreCheckerPredicate.test(8d) ? "Число больше или равно 10" : "Число меньше 10");
    }
}
