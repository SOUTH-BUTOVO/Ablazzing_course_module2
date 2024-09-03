package org.javaacademy.module2.lesson2.homework.ex2_hydrometcentre;

//Задание №2 Гидрометцентр
//Создать две структуры данных, в которых будет статистика по дням (среднесуточная температура воздуха)
//Январь: 0,-1,-1,-2,-5,-6,-7,-8,-9,-10,-5,-5,-2,-7,-3,-1,-8,-9,-8,-8,-18,-20,-23,-24,-25,-9,-8,-7,-6,-5,-1
//Февраль: -8,-10,-12,-13,-15,-16,-12,-7,-8,-10,-10,-9,-8,-8,-8,-9,-10,-9,-5,-6,-8,-7,-8,-9,-6,-5,-3,-1
//Объединить данные за январь и февраль, посчитать среднесуточную температуру воздуха за 2 месяца.
//Запрещено использовать массивы.

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        String temperatureJanuary = "0, -1, -1, -2, -5, -6, -7, -8, -9, -10, -5, -5, -2, -7, -3, -1, -8, -9, -8, -8, -18, -20, -23, -24, -25, -9, -8, -7, -6, -5, -1";
        List<Integer> temperatureJanuary1 = List.of(0, -1, -1, -2, -5, -6, -7, -8, -9, -10, -5, -5, -2, -7, -3, -1, -8, -9, -8, -8, -18, -20, -23, -24, -25, -9, -8, -7, -6, -5, -1);

        String temperatureFebruary = "-8,-10,-12,-13,-15,-16,-12,-7,-8,-10,-10,-9,-8,-8,-8,-9,-10,-9,-5,-6,-8,-7,-8,-9,-6,-5,-3,-1";
//        String sum = temperatureFebruary.replace(",", " ");
//        int num = Integer.parseInt(temperatureFebruary);
        //int daysInFebruary = temperatureFebruary.size();
        //String stringAsList = temperatureFebruary.toString();
        ArrayList<Integer> list = new ArrayList<>(List.of(-8, -10, -12, -13, -15, -16, -12, -7, -8, -10, -10, -9, -8, -8, -8, -9, -10, -9, -5, -6, -8, -7, -8, -9, -6, -5, -3, -1));
        BigDecimal averageAirTemperatureJanuary = new BigDecimal(1);

        System.out.println(averageAirTemperatureJanuary);

//        System.out.println(averageAirTemperatureJanuary);
    }
}
