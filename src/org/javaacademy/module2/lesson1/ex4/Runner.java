package org.javaacademy.module2.lesson1.ex4;

public class Runner {
    public static void main(String[] args) {
        CarWashing carWashing = new CarWashing();
        LightCar lightCar = new LightCar();
        Bus bus = new Bus();

        Car wash1 = carWashing.wash(lightCar);
        Car wash2 = carWashing.wash(bus);
        System.out.println(wash1.getClass());
        System.out.println(wash2.getClass());

        Bus newBus = carWashing.sellCar(Bus.class);
    }
}
