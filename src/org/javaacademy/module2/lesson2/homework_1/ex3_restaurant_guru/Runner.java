package org.javaacademy.module2.lesson2.homework_1.ex3_restaurant_guru;

//Задание №3 Ресторанный гуру
//Николай Петрович ходит по ресторанам. За 5 дней он был во множестве ресторанов.
//Он обратился к вам, чтобы узнать в каком ресторане(ах) он был каждый день
// (т.е. найти ресторан(ы) в которых он был и в понедельник, и во вторник, и в среду и тд).
//ArrayList<String> monday = new ArrayList<>(List.of("Чебуречная №1", "Реберная", "Андерсон", "Ниппон", "Фо бо"));
//ArrayList<String> tuesday = new ArrayList<>(List.of("Вареничная №1", "Пушкин", "Чебуречная №1", "Ниппон", "Реберная"));
//ArrayList<String> wednesday = new ArrayList<>(List.of("Реберная", "Арарат", "Майя", "Ниппон", "Таксим"));
//ArrayList<String> thursday = new ArrayList<>(List.of("Грех", "Ваниль", "Реберная", "Пянсе", "Фо бо"));
//ArrayList<String> friday = new ArrayList<>(List.of("Бёрдс", "Реберная", "Андерсон", "Ниппон", "Чифанька"));

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<String> monday = List.of("Чебуречная №1", "Реберная", "Андерсон", "Ниппон", "Фо бо");
        List<String> tuesday = List.of("Вареничная №1", "Пушкин", "Чебуречная №1", "Ниппон", "Реберная");
        List<String> wednesday = List.of("Реберная", "Арарат", "Майя", "Ниппон", "Таксим");
        List<String> thursday = List.of("Грех", "Ваниль", "Реберная", "Пянсе", "Фо бо");
        List<String> friday = List.of("Бёрдс", "Реберная", "Андерсон", "Ниппон", "Чифанька");

        List<String> resultList = new ArrayList<>(monday);
        for (List<String> day : List.of(tuesday, wednesday, thursday, friday)) {
            resultList.retainAll(day);
        }

        System.out.println("Николай Петрович, был каждый день в ресторан(ах): " + resultList);
    }
}
