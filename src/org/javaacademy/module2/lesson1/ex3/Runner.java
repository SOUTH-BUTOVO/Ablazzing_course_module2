package org.javaacademy.module2.lesson1.ex3;

public class Runner {
    public static void main(String[] args) {
        String text1 = "Hello World";
        String text2 = "Я изучаю Java!";
        String text3 = "Djenerics";
        Container<String> container1 = new Container<>(text1, text2, text3);
        System.out.println(container1);

        Container<Integer> container2 = new Container<>(3, 2, 1);
        System.out.println(container2);
    }
}
