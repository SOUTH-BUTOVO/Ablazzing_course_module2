package org.javaacademy.module2.lesson10.ex2;

public class Cat {
    private String catName;

    private Cat(String name) {
        this.catName = name;
    }

    @Time
    private void say() {
        long start = System.currentTimeMillis();
        System.out.println(catName + " мяукнул");
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
