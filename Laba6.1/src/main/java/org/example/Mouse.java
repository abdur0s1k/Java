package org.example;

public class Mouse {
    // Поля с разными модификаторами доступа
    private String name;
    public int age;
    protected String color;
    String breed; // package-private

    // Конструкторы
    public Mouse() {
        this.name = "Неизвестно";
        this.age = 0;
        this.color = "Серый";
        this.breed = "Полевка";
    }

    public Mouse(String name, int age, String color, String breed) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
    }

    // Методы
    public void squeak() {
        System.out.println(name + " говорит: пис-пис!");
    }

    protected void run() {
        System.out.println(name + " бегает.");
    }

    void eat() {
        System.out.println(name + " ест.");
    }

    private void sleep() {
        System.out.println(name + " спит.");
    }

    public void performSleep() {
        sleep(); // вызов приватного метода
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}