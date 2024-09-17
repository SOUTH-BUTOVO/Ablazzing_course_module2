package org.javaacademy.module2.lesson6.homework3.ex5_sortFeedback;

import java.time.LocalDateTime;

public class Feedback {
    private int idFeedback;
    private String textFeedback;
    private int numberOfLikes;
    private LocalDateTime dateTime;

    public Feedback(int idFeedback, String textFeedback, int numberOfLikes, LocalDateTime dateTime) {
        this.idFeedback = idFeedback;
        this.textFeedback = textFeedback;
        this.numberOfLikes = numberOfLikes;
        this.dateTime = dateTime;
    }

    public int getIdFeedback() {
        return idFeedback;
    }

    public int getNumberOfLikes() {
        return numberOfLikes;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public String toString() {
        return "Feedback{" + "idFeedback=" + idFeedback + ", textFeedback='" + textFeedback + '\'' +
               ", numberOfLikes=" + numberOfLikes + ", dateTime=" + dateTime + '}';
    }
}
