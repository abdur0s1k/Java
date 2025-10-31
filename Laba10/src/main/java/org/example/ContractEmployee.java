package org.example;

public class ContractEmployee extends Employee {

    public ContractEmployee(String fio, String position, double oklad) throws Exception {
        super(fio, position, oklad);
    }

    @Override
    public double calculateSalary() {
        try {
            // Для сотрудника по контракту зарплата = оклад
            if (getOklad() <= 0) {
                throw new IllegalArgumentException("Оклад должен быть положительным числом");
            }

            return getOklad();

        } catch (Exception e) {
            System.err.println("Ошибка расчета зарплаты у контрактного сотрудника: " + e.getMessage());
            return 0;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " (Сотрудник по контракту)";
    }
}
