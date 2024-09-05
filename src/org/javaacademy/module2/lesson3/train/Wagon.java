package org.javaacademy.module2.lesson3.train;

public class Wagon {
    private WagonType wagonType;
    private int number;
    private Wagon next; // Следующий вагон
    private Wagon prev; // Предыдущий вагон

    // Первый вагон
    public Wagon(WagonType wagonType, int number) {
        this.wagonType = wagonType;
        this.number = number;
    }

    // Средний вагон(ы)
    public Wagon(WagonType wagonType, Wagon next, Wagon prev) {
        this.wagonType = wagonType;
        this.next = next;
        this.prev = prev;
    }

    // Последний вагон
    public Wagon(WagonType wagonType, Wagon prev) {
        this.wagonType = wagonType;
        this.prev = prev;
    }

    public WagonType getWagonType() {
        return wagonType;
    }

    public Wagon getNext() {
        return next;
    }

    public Wagon getPrev() {
        return prev;
    }

    public void setNext(Wagon next) {
        this.next = next;
    }

    public void setPrev(Wagon prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return "Wagon{" + "number=" + number + ", wagonType=" + wagonType + '}';
    }
}
