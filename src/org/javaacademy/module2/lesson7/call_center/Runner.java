package org.javaacademy.module2.lesson7.call_center;

public class Runner {
    public static void main(String[] args) {
        CallCenter callCenter = new CallCenter();
        CallScript sellCreditCard = new CallScript() {
            @Override
            public void readScript() {
                System.out.println("предлагаю вам оформить кредитную карту");
            }
        };
        callCenter.call(sellCreditCard);
        System.out.println("------------");

        CallScript sellTariff = () ->
                System.out.println("предлагаю вам оформить новый тарифный план");


        callCenter.call(sellTariff);
        System.out.println("------------");
    }
}
