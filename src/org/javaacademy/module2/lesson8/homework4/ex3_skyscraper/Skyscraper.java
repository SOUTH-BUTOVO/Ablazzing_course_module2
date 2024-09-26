package org.javaacademy.module2.lesson8.homework4.ex3_skyscraper;

public class Skyscraper {
    private String name;
    private int height;

    public Skyscraper(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Skyscraper{" + "name='" + name + '\'' + ", height=" + height + '}';
    }
}
