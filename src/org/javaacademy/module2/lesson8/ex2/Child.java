package org.javaacademy.module2.lesson8.ex2;

public class Child {
    private String name;

    public Child(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Child{" + "name='" + name + '\'' + '}';
    }
}
