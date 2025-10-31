package org.example.task3;

import java.util.*;

public class Report {
    public static void generateReport(List<Employee> employees) {
        System.out.println(String.format("%-15s | %10s", "ФИО", "Зарплата"));
        System.out.println("-------------------------------");
        for (Employee e : employees) {
            System.out.println(String.format("%-15s | %10.2f", e.getFullname(), e.getSalary()));
        }
    }

    public static void advancedReport(List<Employee> employees) {
        employees.sort(Comparator.comparingDouble(Employee::getSalary)
                .thenComparing(Employee::getFullname).reversed());

        System.out.println("Все сотрудники (сортировка по зарплате):");
        employees.forEach(e -> System.out.println(
                String.format("Имя: %-15s Среднемесячная зарплата: %.2f", e.getFullname(), e.getSalary())
        ));

        System.out.println("\nПервые 5 имен:");
        employees.stream().limit(5).map(Employee::getFullname).forEach(System.out::println);

        System.out.println("\nПоследние 3 идентификатора:");
        employees.stream().skip(Math.max(0, employees.size() - 3))
                .forEach(e -> System.out.println(e.getFullname()));
    }
}
