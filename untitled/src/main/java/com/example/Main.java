package com.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Используем конструкторы
        Tester t1 = new Tester("Иван");
        Tester t2 = new Tester("Пётр", "Иванов");
        Tester t3 = new Tester("Сергей", "Петров", 5);

        // Вызываем перегруженные методы
        t1.work();
        t2.work(8);
        t3.work("Написание тестов");

        // Вызов статического метода
        Tester.printGreeting();
    }
}
