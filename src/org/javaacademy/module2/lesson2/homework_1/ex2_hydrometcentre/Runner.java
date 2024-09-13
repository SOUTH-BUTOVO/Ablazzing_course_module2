package org.javaacademy.module2.lesson2.homework_1.ex2_hydrometcentre;

//Задание №2 Гидрометцентр
//Создать две структуры данных, в которых будет статистика по дням (среднесуточная температура воздуха)
//Январь: 0,-1,-1,-2,-5,-6,-7,-8,-9,-10,-5,-5,-2,-7,-3,-1,-8,-9,-8,-8,-18,-20,-23,-24,-25,-9,-8,-7,-6,-5,-1
//Февраль: -8,-10,-12,-13,-15,-16,-12,-7,-8,-10,-10,-9,-8,-8,-8,-9,-10,-9,-5,-6,-8,-7,-8,-9,-6,-5,-3,-1
//Объединить данные за январь и февраль, посчитать среднесуточную температуру воздуха за 2 месяца.
//Запрещено использовать массивы.

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        double averageAirTemperatureJanuary = temperatureJanuary();
        double averageAirTemperatureFebruary = temperatureFebruary();
        double averageAirTemperatureTwoMonths = (averageAirTemperatureJanuary + averageAirTemperatureFebruary) / 2;
        System.out.printf("Среднесуточная температура воздуха за 2 месяца составила: %.1f\n",
                                                             averageAirTemperatureTwoMonths); //  -8,3
    }

    private static double temperatureJanuary() {
        List<Integer> listTemperatureJanuary = List.of(0, -1, -1, -2, -5, -6, -7, -8, -9, -10, -5, -5, -2, -7, -3, -1, -8, -9, -8, -8, -18, -20, -23, -24, -25, -9, -8, -7, -6, -5, -1);
        int daysInJanuary = listTemperatureJanuary.size(); //31 дней в Феврале

        double temperatureJanuary = 0;
        for (double daysTemperature : listTemperatureJanuary) {
            temperatureJanuary += daysTemperature;
        }

        double averageAirTemperatureJanuary = temperatureJanuary / daysInJanuary;
        System.out.printf("Среднесуточная температура в Январе составила: %.1f\n",
                                             averageAirTemperatureJanuary); //-8.1

        return averageAirTemperatureJanuary;
    }

    private static double temperatureFebruary() {
        List<Integer> listTemperatureFebruary = List.of(-8, -10, -12, -13, -15, -16, -12, -7, -8, -10, -10, -9, -8, -8, -8, -9, -10, -9, -5, -6, -8, -7, -8, -9, -6, -5, -3, -1);
        int daysInFebruary = listTemperatureFebruary.size(); //28 дней в Феврале

        double temperatureFebruary = 0;
        for (double daysTemperature : listTemperatureFebruary) {
            temperatureFebruary += daysTemperature;
        }

        double averageAirTemperatureFebruary = temperatureFebruary / daysInFebruary;
        System.out.printf("Среднесуточная температура в Феврале составила: %.1f\n",
                                             averageAirTemperatureFebruary); //-8.6

        return averageAirTemperatureFebruary;
    }
}
