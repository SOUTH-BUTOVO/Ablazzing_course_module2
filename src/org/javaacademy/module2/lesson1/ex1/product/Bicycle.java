package org.javaacademy.module2.lesson1.ex1.product;

/** Велосипед */

public class Bicycle extends Product {

    public Bicycle(double price) {
        super(price);
    }

    public void go() {
        System.out.println("Велосипед едет");
    }

    @Override
    public String toString() {
        return "Bicycle{" + "price=" + price + '}';
    }
}
