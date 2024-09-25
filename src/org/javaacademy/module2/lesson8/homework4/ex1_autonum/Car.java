package org.javaacademy.module2.lesson8.homework4.ex1_autonum;

public class Car {
    private String carNum;

    public Car(String carNum) {
        this.carNum = carNum;
    }

    public String getCarNum() {
        return carNum;
    }

    @Override
    public String toString() {
        return "Car{" + "carNum='" + carNum + '\'' + '}';
    }
}
