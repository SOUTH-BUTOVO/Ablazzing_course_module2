package org.javaacademy.module2.lesson4.homework_2.ex2_customs;

public enum LuggageCategory {
    LIGHT("Лёгкий", 5),
    MIDDLE("Средний", 10),
    HEAVY("Тяжёлый", null);
    private String name;
    private Integer maxLimit;

    LuggageCategory(String name, Integer maxLimit) {
        this.name = name;
        this.maxLimit = maxLimit;
    }

    public String getName() {
        return name;
    }

    public Integer getMaxLimit() {
        return maxLimit;
    }
}
