package org.javaacademy.module2.lesson6.ex2;

import org.javaacademy.module2.lesson6.ex2.car.Audi;
import org.javaacademy.module2.lesson6.ex2.car.Car;
import org.javaacademy.module2.lesson6.ex2.factory.AudiFactory;
import org.javaacademy.module2.lesson6.ex2.factory.BmwFactory;

import java.util.function.Supplier;

public class Runner {
    public static void main(String[] args) {
        AudiFactory audiFactory = new AudiFactory();
        BmwFactory bmwFactory = new BmwFactory();
        Car audi = audiFactory.makeCar();
        Car bmw = bmwFactory.makeCar();

        System.out.println(audi);
        System.out.println(bmw);
        System.out.println("------");

        Supplier<Car> audiFunctionalFactory = () -> {
            System.out.println("Audi created!");
            return new Audi();
        };

        Car audi2 = audiFunctionalFactory.get();
        System.out.println(audi2);
    }
}
