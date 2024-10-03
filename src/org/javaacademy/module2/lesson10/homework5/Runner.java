package org.javaacademy.module2.lesson10.homework5;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;

/**
 * Запрещено изменять модификаторы доступа!
 * Практически все будет через рефлексию
 * Создать банк с 1500 денег
 * Создать вора
 * Дописать метод stealMoney у вора так, чтобы он крал все деньги из банка себе
 * (увеличивал у себя деньги и обнулял деньги банка)
 * Вызвать здесь метод stealMoney
 * Распечатать вора и банк
 * <p>
 * Итог:
 * Вор - 1500 денег
 * Банк - 0 денег
 */

public class Runner {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException,
            IllegalAccessException, InstantiationException {
        Bank bank = createBank(BigDecimal.valueOf(1500));
        System.out.println(bank + " Банк до ограбления");

        Thief thief = createThief();
        stealMoney(thief, bank);
    }

    // Создаём банк с 1500 денег
    private static Bank createBank(BigDecimal bankMoney) throws NoSuchMethodException,
            InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Bank> bankClass = Bank.class;
        // Узнаём тип поля, для использования этого класса в .getDeclaredConstructor()
        //System.out.println(Arrays.toString(bankClass.getDeclaredFields()));
        Constructor<Bank> bankConstructor = bankClass.getDeclaredConstructor(BigDecimal.class);
        bankConstructor.setAccessible(true);
        Bank bank = bankConstructor.newInstance(bankMoney);
        return bank;
    }

    // Создаём вора
    private static Thief createThief() throws NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        Class<Thief> thiefClass = Thief.class;
        Constructor<Thief> thiefConstructor = thiefClass.getDeclaredConstructor();
        thiefConstructor.setAccessible(true);
        System.out.println(thiefConstructor.newInstance() + "    Деньги вора до ограбления");
        Thief thief = thiefConstructor.newInstance();
        return thief;
    }

    // Вызываем метод у вора
    private static void stealMoney(Thief thief, Bank bank) throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {
        Class<Thief> thiefClass = Thief.class;
        // Узнаём сигнатуру метода, для использования в .getDeclaredMethod
        //System.out.println(Arrays.toString(thiefClass.getDeclaredMethods()));
        Method methodStealMoney = thiefClass.getDeclaredMethod("stealMoney", Bank.class);
        methodStealMoney.setAccessible(true);
        methodStealMoney.invoke(thief, bank);
    }
}
