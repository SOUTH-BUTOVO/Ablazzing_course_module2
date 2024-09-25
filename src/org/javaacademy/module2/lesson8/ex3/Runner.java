package org.javaacademy.module2.lesson8.ex3;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        AtomicInteger num = new AtomicInteger(0);
        Stream.generate(() -> num.addAndGet(1)).limit(33).forEach(e -> System.out.print(e + " "));

        String text = "";
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(text);
    }
}
