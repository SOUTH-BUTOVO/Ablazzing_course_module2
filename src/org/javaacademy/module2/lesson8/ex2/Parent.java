package org.javaacademy.module2.lesson8.ex2;

import java.util.List;

public class Parent {
    private List<Child> childList;

    public Parent(List<Child> childList) {
        this.childList = childList;
    }

    public List<Child> getChildList() {
        return childList;
    }
}
