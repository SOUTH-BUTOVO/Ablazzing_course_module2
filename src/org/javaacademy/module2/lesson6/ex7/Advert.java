package org.javaacademy.module2.lesson6.ex7;

import java.math.BigDecimal;

import static java.math.BigDecimal.ZERO;

public class Advert {
    private String text;
    private BigDecimal price = ZERO;

    public Advert(String text, BigDecimal price) {
        this.text = text;
        this.price = price;
    }

    public String getText() {
        return text;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Advert{" + "text='" + text + '\'' + ", price=" + price + '}';
    }
}
