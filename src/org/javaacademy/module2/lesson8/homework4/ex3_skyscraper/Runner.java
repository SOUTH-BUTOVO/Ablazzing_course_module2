package org.javaacademy.module2.lesson8.homework4.ex3_skyscraper;

import java.util.List;
import java.util.stream.Stream;

/**
 * Задание №3 - Небоскребы, небоскребы, а я...
 * 1. Создать Класс Небоскреб - имя небоскреба, его высота в метрах.
 * 2. Необходимо создать небоскребы:
 * Всемирный торговый центр - 541м
 * Шанхайская башня - 632м
 * Бурдж-Халифа - 828м
 * Международный финансовый центр Пинань - 599м
 * Абрадж аль-Бейт - 601м
 * Всемирный центр Лотте - 555м
 * //
 * 3. Занести небоскребы в List! Дважды положить бурдж халифа в лист.
 * //
 * 4. С помощью стримов:
 * 4.1 Убрать дубликаты и сохранить в новый лист (далее работаем с этим листом).
 * (РАЗНЫЕ СТРИМЫ!)
 * 4.2. Вывести только первые три небоскреба.
 * 4.3. Вывести самый высокий небоскреб.
 * 4.4. Вывести те небоскребы, которые выше километра.
 * Если выше километра нет, то вывести на экран: небоскреба выше километра - нет.
 */

public class Runner {
    public static void main(String[] args) {
        Skyscraper theWorldTradeCenter = new Skyscraper("The World Trade Center", 541);
        Skyscraper shanghaiTower = new Skyscraper("Shanghai Tower", 632);
        Skyscraper burjKhalifa = new Skyscraper("Burj Khalifa", 828);
        Skyscraper pinanFinancialCenter = new Skyscraper("Pinan International Financial Center", 599);
        Skyscraper abrajAlBayt = new Skyscraper("Abraj al-Bayt", 601);
        Skyscraper lotteWorldCenter = new Skyscraper("Lotte World Center", 555);
        List<Skyscraper> skyscraperList = List.of(theWorldTradeCenter, shanghaiTower, burjKhalifa,
                burjKhalifa, pinanFinancialCenter, abrajAlBayt, lotteWorldCenter);

        // Убираем дубликаты и создаём новый Лист
        List<Skyscraper> newSkyscraperList = skyscraperList.stream()
                .distinct()
                .toList();

        // Выводим первые три небоскреба
        System.out.println("Выводим первые три небоскреба:");
        newSkyscraperList.stream()
                .limit(3)
                .forEach(e -> System.out.println(e));

        // Выводим самый высокий небоскреб
        System.out.println("\nСамый высокий небоскреб");
        System.out.println(newSkyscraperList.stream()
                .max((a, b) -> a.getHeight() - b.getHeight()));

        // Вывести небоскребы, которые выше километра.
        System.out.println("\nВыводим небоскребы, которые выше километра");
        boolean hasTallSkyscraper = newSkyscraperList.stream()
                .anyMatch(e -> e.getHeight() > 1000);
        if (hasTallSkyscraper) {
            newSkyscraperList.stream()
                    .filter(e -> e.getHeight() > 1000)
                    .forEach(e -> System.out.println(e));
        } else {
            System.out.println("Небоскреба выше километра - нет");
        }
    }
}
