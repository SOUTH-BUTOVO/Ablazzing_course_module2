package org.javaacademy.module2.lesson6.homework3.ex4_universalRuler;

public class Animal {
    private int bodyLength;
    private int tailLength;

    public Animal(int bodyLength, int tailLength) {
        this.bodyLength = bodyLength;
        this.tailLength = tailLength;
    }

    public int getBodyLength() {
        return bodyLength;
    }

    public int getTailLength() {
        return tailLength;
    }
}
