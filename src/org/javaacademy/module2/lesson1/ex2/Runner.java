package org.javaacademy.module2.lesson1.ex2;

import org.javaacademy.module2.lesson1.ex2.input.Input;
import org.javaacademy.module2.lesson1.ex2.input.KeyBoard;
import org.javaacademy.module2.lesson1.ex2.input.Mouse;
import org.javaacademy.module2.lesson1.ex2.output.Monitor;
import org.javaacademy.module2.lesson1.ex2.output.Output;
import org.javaacademy.module2.lesson1.ex2.output.Tv;

public class Runner {
    public static void main(String[] args) {
        KeyBoard keyBoard = new KeyBoard();
        Mouse mouse = new Mouse();
        Monitor monitor = new Monitor();
        Tv tv = new Tv();
        Computer<Input, Output> computer = new Computer<>(keyBoard, monitor);
        //computer.input();

        Input inputObject = computer.getInputObject();
        Output outputObject = computer.getOutputObject();
        System.out.println(inputObject.getClass());
        System.out.println(outputObject.getClass());
//        inputObject.escape();

        computer.input();
        computer.show();
    }
}
