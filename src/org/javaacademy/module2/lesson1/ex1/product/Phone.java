package org.javaacademy.module2.lesson1.ex1.product;

public class Phone extends Product {

    public Phone(double price) {
        super(price);
    }

    public void call() {
        System.out.println("Телефон звонит");
    }

    @Override
    public String toString() {
        return "Phone{" + "price=" + price + '}';
    }
}
