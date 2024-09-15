package org.javaacademy.module2.lesson6.ex7;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.math.BigDecimal.valueOf;

public class Runner {
    public static void main(String[] args) {
        Advert advert1 = new Advert("Продам автомобиль", valueOf(1_500_000));
        Advert advert2 = new Advert("Продам компьютер", valueOf(100_000));
        Advert advert3 = new Advert("Куплю холодильник", valueOf(50_000));
        ArrayList<Advert> adverts = new ArrayList<>(List.of(advert1, advert2, advert3));
        Comparator<Advert> advertComparator = (o1, o2) -> o1.getPrice().compareTo(o2.getPrice());
        Comparator<Advert> comparator = advertComparator;
        adverts.sort(comparator.reversed());
        System.out.println(adverts);
    }
}
