package org.javaacademy.module2.lesson1.ex1.shop;

import org.javaacademy.module2.lesson1.ex1.product.Product;

public abstract class ProductShop {

    private Product product;

    public void buy(Product product) {
        this.product = product;
    }

    public Product sell(double money) {
        if (product == null) {
            throw new RuntimeException("В наличии нет для продажи");
        }
        if (product.getPrice() <= money) {
            Product temp = product;
            product = null;
            return temp;
        }
        throw new RuntimeException("Денег не достаточно для покупки");
    }
}
