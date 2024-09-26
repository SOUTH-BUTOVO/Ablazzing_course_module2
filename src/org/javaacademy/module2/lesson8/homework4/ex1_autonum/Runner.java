package org.javaacademy.module2.lesson8.homework4.ex1_autonum;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * ИСПОЛЬЗОВАНИЕ FOR, WHILE ЗАПРЕЩЕНО В ЭТОЙ ДЗ! Только СТРИМЫ.
 * //
 * Задание №1 - Список спец номеров
 * Нам необходимо распечатать список номеров, которые принадлежат чиновникам
 * 1. Создать класс машина. У машины есть номер.
 * 2. Создать 50 машин с номерами а0[01-50]ан799 (где [01-50] - это все значения от 01 до 50)
 * 3. Создать 50 машин с номерами к0[01-50]се178 (где [01-50] - это все значения от 01 до 50)
 * 4. Объединить машины в единый стрим
 * 5. Оставить в объединенном стриме машины с номерами 04[0-9] - это номера, выдаваемые чиновникам
 * 6. Получить из оставшихся машин номера.
 * 7. Распечатать номера.
 * ожидаемый результат:
 * a040ан799
 * a041ан799
 * ...
 * k048се178
 * k049се178
 */

public class Runner {
    final static int START_CAR_NUM = 1;
    final static int END_CAR_NUM = 50;
    final static char PREFIX1 = 'а';
    final static String SUFFIX1 = "ан799";
    final static char PREFIX2 = 'к';
    final static String SUFFIX2 = "се178";

    public static void main(String[] args) {
        resultStream();

    }

    private static List<Car> listCar1() {
        // Создаём номер для авто
        List<String> carNum = IntStream.rangeClosed(START_CAR_NUM, END_CAR_NUM)
                .mapToObj(number -> PREFIX1 + String.format("%03d", number) + SUFFIX1)
                .toList();

        // Создаём авто и добавляем номер
        List<Car> cars = IntStream.range(0, END_CAR_NUM)
                .mapToObj(car -> new Car(carNum.get(car)))
                .toList();
        return cars;
    }

    private static List<Car> listCar2() {
        // Создаём номер для авто
        List<String> carNum = IntStream.rangeClosed(START_CAR_NUM, END_CAR_NUM)
                .mapToObj(number -> PREFIX2 + String.format("%03d", number) + SUFFIX2)
                .toList();

        // Создаём авто и добавляем номер
        List<Car> cars = IntStream.range(0, END_CAR_NUM)
                .mapToObj(car -> new Car(carNum.get(car)))
                .toList();
        return cars;
    }

    private static void resultStream() {
        // Объединяем машины в единый стрим
        Stream<Car> streamCar = Stream.concat(listCar1().stream(), listCar2().stream());

        Map<Boolean, List<String>> partitioned = streamCar
                // Разделяем элементы на две группы
                .collect(Collectors.partitioningBy(car -> {
                    String num = car.getCarNum().substring(1, 4);
                    // С регулярным выражением у меня не получилось((
                    //.filter(car -> Pattern.matches("^\\w{1}00[2-3]\\w{2}\\d{3}$", car.getCarNum()))
                    return Integer.parseInt(num) >= 40 && Integer.parseInt(num) <= 49;
                }, Collectors.mapping(car -> car.getCarNum(), Collectors.toList())));

        List<String> official = partitioned.get(true);
        List<String> remnant = partitioned.get(false);

        System.out.println("номера выданные чиновникам:");
        System.out.println(official);
        System.out.println("оставшиеся выданные номера:");
        System.out.println(remnant);
    }
}
