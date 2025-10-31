package com.example;

public class Tester {
    String name;
    String surname;
    int experienceInYears;
    String englishLevel;
    double salary;

    public Tester(String name) {
        this(name, "Unknown"); // вызывает следующий конструктор
    }

    public Tester(String name, String surname) {
        this(name, surname, 0); // вызывает следующий конструктор
    }

    public Tester(String name, String surname, int experienceInYears) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = "Beginner";
        this.salary = 0.0;
    }

    public void work() {
        System.out.println(name + " работает");
    }

    public void work(int hours) {
        System.out.println(name + " работает " + hours + " часов");
    }

    public void work(String task) {
        System.out.println(name + " выполняет задачу: " + task);
    }

    public static void printGreeting() {
        System.out.println("Привет из статического метода!");
    }
}