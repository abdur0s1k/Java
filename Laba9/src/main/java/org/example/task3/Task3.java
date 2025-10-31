package org.example.task3;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void run() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Иванов", 50000));
        employees.add(new Employee("Петров", 60000));
        employees.add(new Employee("Сидоров", 45000));
        employees.add(new Employee("Алексеева", 60000));
        employees.add(new Employee("Кузнецов", 70000));
        employees.add(new Employee("Смирнов", 40000));

        Report.generateReport(employees);
        System.out.println();
        Report.advancedReport(employees);
    }
}