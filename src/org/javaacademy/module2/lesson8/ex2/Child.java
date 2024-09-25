package org.javaacademy.module2.lesson8.ex2;

public class Child {
    private String name;
    private Integer age;

    public Child(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Child{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
