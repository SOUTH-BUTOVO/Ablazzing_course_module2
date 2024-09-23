package org.javaacademy.module2.lesson7.call_center;

public class CallCenter {

    public void call(CallScript callScript) {
        System.out.println("Здравствуйте, меня зовут Олег из ВТБ!");
        callScript.readScript();
    }
}
