package org.javaacademy.module2.lesson7.ex4;

import java.util.List;
import java.util.Optional;

public class Runner2 {
    public static void main(String[] args) {
        List<Object> list = List.of();
        Optional<Object> nameOptional = list.stream().findFirst();

        // Замена в случаи null
        System.out.println(nameOptional.orElse("Нет значений!"));

        // В случае null получаем ошибку NSEE не NPE
        System.out.println(nameOptional.orElseThrow());
    }
}
