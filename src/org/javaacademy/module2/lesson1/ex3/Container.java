package org.javaacademy.module2.lesson1.ex3;

public class Container <T> {
    private T value1;
    private T value2;
    private T value3;

    public Container(T value1, T value2, T value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public T getValue1() {
        return value1;
    }

    public T getValue2() {
        return value2;
    }

    public T getValue3() {
        return value3;
    }

    @Override
    public String toString() {
        return "Container:\n" + "value1 = " + value1 +",\nvalue2 = " + value2 + ",\nvalue3 = " + value3;
    }
}
