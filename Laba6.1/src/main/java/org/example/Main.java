package org.example;

import org.example.Mouse;
import org.example.OneDimensionalArray;

public class Main {
    public static void main(String[] args) {
        // =========================
        // Задание 1: Mouse
        // =========================
        Mouse mouse1 = new Mouse();
        Mouse mouse2 = new Mouse("Джерри", 2, "Коричневый", "Домашняя мышь");

        System.out.println(mouse1);
        System.out.println(mouse2);

        mouse1.squeak();
        mouse2.squeak();

        mouse1.eat();
        mouse2.run();

        mouse1.performSleep(); // Вызов приватного метода через публичный

        // =========================
        // Задание 2: OneDimensionalArray
        // =========================
        OneDimensionalArray array = new OneDimensionalArray();
        array.create(5);
        array.print();

        array.add(10);
        System.out.println("После сложения 10:");
        array.print();

        array.subtract(3);
        System.out.println("После вычитания 3:");
        array.print();

        array.multiply(2);
        System.out.println("После умножения на 2:");
        array.print();
    }
}
