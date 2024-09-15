package org.javaacademy.module2.lesson6.homework3.ex5_sortFeedback;

/** Задание №5: сортировка отзывов
 Создать класс отзыв с полями: id отзыва, текст отзыва, количество лайков,
 дата + время отзыва (LocalDateTime) - НЕ ИСПОЛЬЗОВАТЬ COMPARABLE!
 Создать коллекцию, которая хранит отсортированные отзывы по:
    1.лайкам
    2.(Если лайки совпадают) дата + время отзыва
    3.(Если лайки и дата + время отзыва совпадают) id
 Уникальность определяется на основе сортировки.
 Создать comparator через лямбда выражение, для сортировки отзывов:

 Пример, отсортированный:
           (id, текст, кол-во лайков, дата+время)
 отзыв №1: 1, отличный товар, 200, 25.01.2024 13:37
 отзыв №2: 2, так себе товар, 100, 25.01.2024 16:37
 отзыв №4: 4, плохой товар, 100, 25.01.2024 13:37
 отзыв №3: 3, плохой товар, 100, 25.01.2024 13:37 */

public class Runner {
}
