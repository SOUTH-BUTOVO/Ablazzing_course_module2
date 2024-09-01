package org.javaacademy.module2.lesson1.ex1.shop;

import org.javaacademy.module2.lesson1.ex1.product.Product;

public class ProductShopGeneric <T extends Product> {

    private T product;

    public void buy(T product) {
        this.product = product;
    }

    public T sell(double money) {
        if (product == null) {
            throw new RuntimeException("В наличии нет для продажи");
        }
        if (product.getPrice() <= money) {
            T temp = product;
            product = null;
            return temp;
        }
        throw new RuntimeException("Денег не достаточно для покупки");
    }
}
