package org.javaacademy.module2.lesson2.homework.ex1_zoo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zoo<T extends Animal> {

    private T animal1;
    private T animal2;
    private T animal3;

    ArrayList<Animal> animals = new ArrayList<>();

    public Zoo(ArrayList<Animal> animals) {
        this.animals = animals;
    }
    //    public Zoo(T animal1, T animal2, T animal3) {
//        this.animal1 = animal1;
//        this.animal2 = animal2;
//        this.animal3 = animal3;
//    }



    public void voice() {

    }

    public T getAnimal1() {
        return this.animal1;
    }

    public T getAnimal2() {
        return animal2;
    }

    public T getAnimal3() {
        return animal3;
    }

    @Override
    public String toString() {
        return "Zoo " + "animal1 = " + animal1 + ", animal2 = " + animal2 + ", animal3 = " + animal3;
    }
}
