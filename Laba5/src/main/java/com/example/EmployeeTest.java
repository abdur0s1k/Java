package com.example;

import com.example.domain.Developer;
import com.example.domain.Employee;
import com.example.domain.Intern;
import com.example.domain.Manager;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmpId(101);
        emp.setName("Jane Smith");
        emp.setSalary(120_345.27);
        emp.setSsn("012-34-5678");

        System.out.println("Employee ID: " + emp.getEmpId());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Soc Sec #: " + emp.getSsn());
        System.out.println("Employee Salary: " + emp.getSalary());

        // Создаем объекты наследников
        Manager mgr = new Manager();
        mgr.setEmpId(102);
        mgr.setName("Alice Johnson");
        mgr.setSalary(150_000);
        mgr.setSsn("987-65-4321");
        mgr.setDepartment("IT");

        System.out.println("\nManager Name: " + mgr.getName() + ", Department: " + mgr.getDepartment());

        Developer dev = new Developer();
        dev.setEmpId(103);
        dev.setName("Bob Brown");
        dev.setSalary(110_000);
        dev.setSsn("234-56-7890");
        dev.setProgrammingLanguage("Java");

        System.out.println("Developer Name: " + dev.getName() + ", Language: " + dev.getProgrammingLanguage());

        Intern intern = new Intern();
        intern.setEmpId(104);
        intern.setName("Charlie Green");
        intern.setSalary(30_000);
        intern.setSsn("345-67-8901");
        intern.setDurationMonths(6);

        System.out.println("Intern Name: " + intern.getName() + ", Internship Duration: " + intern.getDurationMonths() + " months");
    }
}
