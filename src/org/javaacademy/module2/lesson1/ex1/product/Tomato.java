package org.javaacademy.module2.lesson1.ex1.product;

public class Tomato extends Product {

    public Tomato(double price) {
        super(price);
    }

    public void call() {
        System.out.println("Телефон звонит");
    }

    @Override
    public String toString() {
        return "Tomato{" + "price=" + price + '}';
    }
}
