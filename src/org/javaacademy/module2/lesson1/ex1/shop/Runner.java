package org.javaacademy.module2.lesson1.ex1.shop;

import org.javaacademy.module2.lesson1.ex1.product.Phone;
import org.javaacademy.module2.lesson1.ex1.product.Tomato;

public class Runner {
    public static void main(String[] args) {
//        BicycleShop bicycleShop = new BicycleShop();
//        bicycleShop.buy(new Bicycle(7_000));
//        Product bicycleSell = bicycleShop.sell(10_000);
//        System.out.println(bicycleSell);
//
//        PhoneShop phoneShop = new PhoneShop();
//        phoneShop.buy(new Phone(1_000));
//        Product phoneSell = phoneShop.sell(2_000);
////        phoneSell.call();
//        if (phoneSell instanceof Phone) {
//            ((Phone) phoneSell).call();
//        }
//        System.out.println(phoneSell);

        ProductShopGeneric<Phone> phoneProductShopGeneric = new ProductShopGeneric<>();
        phoneProductShopGeneric.buy(new Phone(1000));
        Phone phone = phoneProductShopGeneric.sell(2000);
        phone.call();

        ProductShopGeneric<Tomato> tomatoProductShopGeneric = new ProductShopGeneric<>();
    }
}
