package com.example.domain;

public class Employee {
    public int empId;
    public String name;
    public String ssn;
    public double salary;

    // Конструктор
    public Employee(int empId, String name, String ssn, double salary) {
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    public void dsplayinfo() {
        System.out.println(empId);
        System.out.println(name);
        System.out.println(ssn);
        System.out.println(salary);

    }


    // Геттеры и сеттеры
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
