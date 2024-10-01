package org.javaacademy.module2.lesson9.ex2;

public class Runner {
    public static void main(String[] args) {

        Animal animal = new Animal(9);
//        animal.run();
        FlyAnimal flyAnimal = new FlyAnimal(9);

//        Animal cheetah = new Cheetah(9);
//        cheetah.run();

        Animal[] animals = {animal, flyAnimal};
        for (Animal el : animals) {
            el.run();
        }
    }
}
