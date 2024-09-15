package org.javaacademy.module2.lesson6.ex1;

import java.util.Random;

public class Runner {
    private static int[] array = new int[1];

    public static void main(String[] args) {
        System.out.println(substring("text"));
        System.out.println(substring(null));

    }

    private static String substring(String text) {
        return new Random().nextInt() + "";
    }

    private static int calc(int a, int b) {
        array[0] = a + b;
        return a + b;
    }

    private static void printSquare(int number) {
        System.out.println(makeSquare(number));
    }

    private static int makeSquare(int number) {
        return number * number;
    }
}
