package org.javaacademy.module2.lesson1.ex2.output;

public class Tv implements Output {
    @Override
    public void show() {
        System.out.println("Телевизор вещает");
    }

    public void makeSound() {
        System.out.println("Говорит Москва!");
    }
}
