package com.example.domain;

public class Manager extends Employee {
    private String department;

    public Manager(int empId, String name, String ssn, double salary, String department) {
        super(empId, name, ssn, salary); // вызов конструктора родителя
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    @Override
    public void dsplayinfo() {
        super.dsplayinfo();
        System.out.println("Department: " + department);
    }
}
