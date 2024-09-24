package org.javaacademy.module2.lesson8.ex2;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Parent parent = new Parent(List.of(new Child("Пётр"), new Child("Фёдор")));
        Parent parent2 = new Parent(List.of(new Child("Аня"), new Child("Маша")));
    }
}
