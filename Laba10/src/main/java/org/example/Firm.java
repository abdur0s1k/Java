package org.example;

import java.util.ArrayList;
import java.util.List;

public class Firm {
    private String name;
    private List<Department> departments;

    public Firm(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    @Override
    public String toString() {
        return "Фирма: " + name + ", Количество отделов: " + departments.size();
    }
}
