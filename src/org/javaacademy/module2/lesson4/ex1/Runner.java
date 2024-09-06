package org.javaacademy.module2.lesson4.ex1;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Child child1 = new Child("Иван", "Иванов", 2020);
        Child child2 = new Child("Иван", "Иванов", 2020);
        System.out.println(child1.equals(child2));
        System.out.println("---------------------");

        Child child3 = new Child("Миша", "Козлов", 2021);
        Child child4 = new Child("Сергей", "Топтунов", 2022);
        Child child5 = new Child("Аня", "Петрова", 2020);
        Child child6 = new Child("Маша", "Сверидова", 2025);

        ChildGarden childGarden = new ChildGarden(10);

//        var groups = new List[3];
//        groups[0] = List.of(child1, child5);
//        groups[1] = List.of(child3);
//        groups[2] = List.of(child4);
//
//        int countGroup1 = 1;
//        for (List group : groups) {
//            System.out.println("Группа: " + countGroup1++);
//            System.out.println(group);
//            System.out.println("---------------------");
//        }

        childGarden.addChild(child1);
        childGarden.addChild(child3);
        childGarden.addChild(child4);
        childGarden.addChild(child5);
        childGarden.addChild(child6);

        int countGroup2 = 1;
        for (List<Child> group : childGarden.getGroups()) {
            System.out.println("Группа: " + countGroup2++);
            System.out.println(group);
            System.out.println("---------------------");
        }
    }
}
