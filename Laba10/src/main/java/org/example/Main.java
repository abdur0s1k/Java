package org.example;

import org.example.exceptions.OkladException;

public class Main {
    public static void main(String[] args) {
        try {
            // Создаем фирму
            Firm firm = new Firm("ТехноПром");

            // Создаем отделы
            Department itDepartment = new Department("IT отдел");
            Department hrDepartment = new Department("HR отдел");

            // Демонстрация работы с исключениями OkladException
            System.out.println("=== Демонстрация обработки OkladException ===");

            try {
                // Попытка создать сотрудника с отрицательным окладом
                Employee invalidEmployee = new StaffEmployee("Иван Иванов", "Программист", -50000, 10000);
            } catch (OkladException e) {
                System.err.println("Перехвачено OkladException: " + e.getMessage());
                System.err.println("Неверный оклад: " + e.getInvalidOklad());

                // Повторно создаем исключение (как требуется в задании)
                throw new OkladException("Повторное исключение: " + e.getMessage(), e.getInvalidOklad());
            } catch (Exception e) {
                System.err.println("Другая ошибка при создании сотрудника: " + e.getMessage());
            }

            System.out.println("\n=== Создание корректных сотрудников ===");

            // Создаем корректных сотрудников
            Employee staff1 = new StaffEmployee("Петр Сидоров", "Senior Developer", 150000, 30000);
            Employee staff2 = new StaffEmployee("Мария Петрова", "Project Manager", 120000, 25000);
            Employee contract1 = new ContractEmployee("Анна Смирнова", "Консультант", 80000);

            // Добавляем сотрудников в отделы
            itDepartment.addEmployee(staff1);
            itDepartment.addEmployee(contract1);
            hrDepartment.addEmployee(staff2);

            // Добавляем отделы в фирму
            firm.addDepartment(itDepartment);
            firm.addDepartment(hrDepartment);

            // Выводим информацию о фирме
            System.out.println(firm);
            for (Department dept : firm.getDepartments()) {
                System.out.println(dept);
                for (Employee emp : dept.getEmployees()) {
                    System.out.println("  " + emp);
                }
            }

            System.out.println("\n=== Демонстрация расчета зарплаты ===");

            // Расчет зарплат штатных сотрудников
            System.out.println("Зарплата " + staff1.getFio() + ": " + staff1.calculateSalary());
            System.out.println("Зарплата " + staff2.getFio() + ": " + staff2.calculateSalary());
            System.out.println("Зарплата " + contract1.getFio() + ": " + contract1.calculateSalary());

            System.out.println("\n=== Демонстрация обработки PremiyaException ===");

            // Создаем сотрудника с отрицательной премией для демонстрации PremiyaException
            Employee staffWithNegativePremia = new StaffEmployee("Олег Negative", "Tester", 70000, -10000);
            System.out.println("Зарплата с отрицательной премией: " + staffWithNegativePremia.calculateSalary());

        } catch (OkladException e) {
            System.err.println("Обработка OkladException в main: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Общая ошибка: " + e.getMessage());
            e.printStackTrace();
        }
    }
}