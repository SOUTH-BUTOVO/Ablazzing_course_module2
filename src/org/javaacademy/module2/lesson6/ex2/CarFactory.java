package org.javaacademy.module2.lesson6.ex2;

import org.javaacademy.module2.lesson6.ex2.car.Car;

@FunctionalInterface
public interface CarFactory {
    Car makeCar();
}
