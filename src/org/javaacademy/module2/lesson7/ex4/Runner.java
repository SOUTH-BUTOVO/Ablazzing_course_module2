package org.javaacademy.module2.lesson7.ex4;

import java.util.Optional;

public class Runner {
    public static void main(String[] args) {

        Optional<String> optional = Optional.ofNullable(null);

        MyOptional myOptional = MyOptional.ofNullable(null);

//        MyOptional myOptional1 = MyOptional.of(null);

//        String value = myOptional.orElseOrThrow();

        // Подмена
        System.out.println(myOptional.orElse("").contains("П"));

    }
}
