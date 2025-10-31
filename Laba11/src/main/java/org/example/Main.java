package org.example;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        try {
            // Выбор задания
            System.out.println("""
                    Выберите задание:
                    1 - Информация о себе
                    2 - Средняя температура
                    3 - Уникальные имена
                    """);

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            scanner.nextLine(); // очистка буфера

            switch (choice) {
                case 1 -> task1();
                case 2 -> task2();
                case 3 -> task3();
                default -> System.out.println("Неверный выбор!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ---------------- Задание 1 ----------------
    public static void task1() {
        String filename = "about_me.txt";
        String content = """
                Имя: Алексей
                Возраст: 21
                Профессия: Программист
                Хобби: Разработка приложений и кофе
                """;

        try {
            Files.writeString(Paths.get(filename), content);
            System.out.println("Файл успешно создан: " + filename);

            // Информация о файле
            File file = new File(filename);
            System.out.println("Абсолютный путь: " + file.getAbsolutePath());
            System.out.println("Размер (байт): " + file.length());
            System.out.println("Можно читать: " + file.canRead());
            System.out.println("Можно записывать: " + file.canWrite());

            // Чтение содержимого
            System.out.println("\nСодержимое файла:");
            Files.lines(Paths.get(filename)).forEach(System.out::println);

        } catch (IOException e) {
            System.err.println("Ошибка при работе с файлом: " + e.getMessage());
        }
    }

    // ---------------- Задание 2 ----------------
    public static void task2() {
        String filename = "temperatures.txt";
        Scanner scanner = new Scanner(System.in);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            System.out.println("Введите 15 значений температуры:");
            for (int i = 0; i < 15; i++) {
                System.out.print((i + 1) + ": ");
                double temp = scanner.nextDouble();
                writer.write(temp + "\n");
            }
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл: " + e.getMessage());
            return;
        }

        // Чтение и вычисление средней температуры
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            List<Double> temps = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                temps.add(Double.parseDouble(line));
            }

            double average = temps.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
            System.out.println("Средняя температура: " + average);
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
        }
    }

    // ---------------- Задание 3 ----------------
    public static void task3() {
        String filename = "names.txt";
        Scanner scanner = new Scanner(System.in);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            System.out.println("Введите имена (через Enter, окончание - пустая строка):");
            while (true) {
                String name = scanner.nextLine().trim();
                if (name.isEmpty()) break;
                writer.write(name + "\n");
            }
        } catch (IOException e) {
            System.err.println("Ошибка при записи имен: " + e.getMessage());
            return;
        }

        try {
            List<String> names = Files.readAllLines(Paths.get(filename));
            Set<String> unique = new HashSet<>();
            for (String name : names) {
                if (!unique.add(name)) {
                    throw new IllegalArgumentException("Имя не уникально: " + name);
                }
            }
            System.out.println("Все имена уникальны!");
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}
