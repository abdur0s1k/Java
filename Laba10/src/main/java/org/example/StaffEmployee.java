package org.example;

import org.example.exceptions.PremiyaException;

public class StaffEmployee extends Employee {
    private double premia;

    public StaffEmployee(String fio, String position, double oklad, double premia) throws Exception {
        super(fio, position, oklad);
        this.premia = premia;
    }

    public double getPremia() {
        return premia;
    }

    public void setPremia(double premia) {
        this.premia = premia;
    }

    @Override
    public double calculateSalary() {
        try {
            // Проверка на отрицательную премию
            if (premia < 0) {
                throw new PremiyaException("Премия не может быть отрицательной: " + premia);
            }

            // Дополнительные проверки
            if (getOklad() <= 0) {
                throw new IllegalArgumentException("Оклад должен быть положительным числом");
            }

            return getOklad() + premia;

        } catch (PremiyaException e) {
            System.err.println("Ошибка расчета зарплаты (PremiyaException): " + e.getMessage());
            return getOklad(); // Возвращаем только оклад без премии
        } catch (Exception e) {
            System.err.println("Ошибка расчета зарплаты: " + e.getMessage());
            return 0;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Премия: " + premia + " (Штатный сотрудник)";
    }
}
