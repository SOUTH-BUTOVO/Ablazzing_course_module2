package org.javaacademy.module2.lesson6.homework3.ex1_garden;

import org.javaacademy.module2.lesson6.homework3.ex1_garden.fruit.Fruit;

import java.util.function.Supplier;

@FunctionalInterface
public interface Garden<T extends Fruit> extends Supplier<T> {
}
