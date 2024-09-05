package org.javaacademy.module2.lesson3.train;

public class Runner {
    public static void main(String[] args) {
        Wagon wagon1 = new Wagon(WagonType.PASSENGER, 1);
        Train train = new Train(wagon1);

        Wagon wagon2 = new Wagon(WagonType.PASSENGER, 2);
        train.addLast(wagon2);

        Wagon wagon3 = new Wagon(WagonType.PASSENGER, 3);
        train.addLast(wagon3);

        Wagon wagon4 = new Wagon(WagonType.PASSENGER, 4);
        train.addLast(wagon4);

        Wagon wagon5 = new Wagon(WagonType.WOOD, 5);
        train.addLast(wagon5);

        Wagon wagon6 = new Wagon(WagonType.VODKA, 6);
        train.addFirst(wagon6);

        System.out.println("Поиск с начало состава: " + train.getFromStartByIndex(0));
        System.out.println("Поиск с начало конца: " + train.getFromEndByIndex(0));

        System.out.printf("");
    }
}
