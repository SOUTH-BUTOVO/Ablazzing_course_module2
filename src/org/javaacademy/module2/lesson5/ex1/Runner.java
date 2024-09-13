package org.javaacademy.module2.lesson5.ex1;

import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        String num1 = "4001A2020";
        String num2 = "4002A2121";
        String num3 = "4003A2222";
        List<String> passportNum = List.of(num1, num2, num3, num1);
        System.out.println(passportNum);
        System.out.println(Map.of(num1, "", num2, "", num3, ""));

        HashSet<String> setPassNum = new HashSet<>(passportNum);
        System.out.println(setPassNum);

        for (String number : setPassNum) {
            System.out.println(number);
        }
        System.out.println(setPassNum.contains(num1));
    }
}
