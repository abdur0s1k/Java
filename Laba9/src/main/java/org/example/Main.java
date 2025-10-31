package org.example;

import java.util.Scanner;
import org.example.task1.Task1;
import org.example.task2.Task2;
import org.example.task3.Task3;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите задание (1, 2, 3): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> Task1.run();
            case 2 -> Task2.run();
            case 3 -> Task3.run();
            default -> System.out.println("Некорректный выбор");
        }
    }
}
