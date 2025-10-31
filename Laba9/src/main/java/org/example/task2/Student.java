package org.example.task2;

import java.util.*;

public class Student {
    private String name;
    private String group;
    private int course;
    private List<Integer> grades;

    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public double averageGrade() {
        return grades.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    public void nextCourse() {
        this.course++;
    }

    public static void processStudents(List<Student> students) {
        students.removeIf(s -> s.averageGrade() < 3);
        students.forEach(s -> {
            if (s.averageGrade() >= 3) s.nextCourse();
        });
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("Студенты курса " + course + ":");
        students.stream()
                .filter(s -> s.getCourse() == course)
                .map(Student::getName)
                .forEach(System.out::println);
    }
}
