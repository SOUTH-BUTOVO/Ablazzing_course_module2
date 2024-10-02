package org.javaacademy.module2.lesson10.homework5;

import java.math.BigDecimal;

/**
 * Вор
 */
public class Thief {
    private BigDecimal money;

    private Thief() {
        this.money = BigDecimal.ZERO;
    }

    private void stealMoney(Bank bank) {
        System.out.println("Вор залез в хранилище банка");
//        if (bank > 0) {
//            System.out.println("Вор крадёт все деньги банка");
//            this.money = bank;
//
//        }
    }

    @Override
    public String toString() {
        return "Thief {" + "money = " + money + '}';
    }
}