package org.javaacademy.module2.lesson6.homework3.ex5_sortFeedback;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Задание №5: сортировка отзывов
 * Создать класс отзыв с полями: id отзыва, текст отзыва, количество лайков,
 * дата + время отзыва (LocalDateTime) - НЕ ИСПОЛЬЗОВАТЬ COMPARABLE!
 * Создать коллекцию, которая хранит отсортированные отзывы по:
 * 1.лайкам
 * 2.(Если лайки совпадают) дата + время отзыва
 * 3.(Если лайки и дата + время отзыва совпадают) id
 * Уникальность определяется на основе сортировки.
 * Создать comparator через лямбда выражение, для сортировки отзывов:
 *
 * Пример, отсортированный:
 *          (id, текст, кол-во лайков, дата+время)
 * отзыв №1: 1, отличный товар, 200, 25.01.2024 13:37
 * отзыв №2: 2, так себе товар, 100, 25.01.2024 16:37
 * отзыв №4: 4, плохой товар, 100, 25.01.2024 13:37
 * отзыв №3: 3, плохой товар, 100, 25.01.2024 13:37
 */

public class Runner {
    public static void main(String[] args) {
        LocalDateTime dateFeedback1 = LocalDateTime.of(2024, 01, 25, 13, 37);
        LocalDateTime dateFeedback2 = LocalDateTime.of(2024, 01, 25, 16, 37);
        LocalDateTime dateFeedback4 = LocalDateTime.of(2024, 01, 25, 13, 37);
        LocalDateTime dateFeedback3 = LocalDateTime.of(2024, 01, 25, 13, 37);

        Feedback feedback1 = new Feedback(1, "отличный товар",
                200, dateFeedback1);
        Feedback feedback2 = new Feedback(2, "так себе товар",
                100, dateFeedback2);
        Feedback feedback4 = new Feedback(4, "плохой товар",
                100, dateFeedback4);
        Feedback feedback3 = new Feedback(3, "плохой товар",
                10, dateFeedback3);

        // Сортировка по количеству лайков
        Comparator<Feedback> byLikes = (cr1, cr2) -> cr1.getNumberOfLikes() - cr2.getNumberOfLikes();
        // Сортировка по дате и времени
        Comparator<Feedback> byDateTime = (cr1, cr2) -> cr1.getDateTime().compareTo(cr2.getDateTime());
        // Сортировка по id
        Comparator<Feedback> byId = (cr1, cr2) -> cr1.getIdFeedback() - cr2.getIdFeedback();

        // Создаём и добавляем сортировки через .thenComparing()
        Comparator<Feedback> comparator = byLikes.thenComparing(byDateTime).thenComparing(byId);

        Set<Feedback> feedbacks = new TreeSet<>(comparator);
        feedbacks.add(feedback1);
        feedbacks.add(feedback2);
        feedbacks.add(feedback4);
        feedbacks.add(feedback3);

        for (Feedback feedback : feedbacks) {
            System.out.println(feedback);
        }
    }
}
