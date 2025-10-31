package org.example.task2;

import java.util.*;

public class Task2 {
    public static void run() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Алексей", "A1", 1, Arrays.asList(4, 5, 3)));
        students.add(new Student("Мария", "A1", 1, Arrays.asList(2, 3, 2)));
        students.add(new Student("Иван", "B2", 2, Arrays.asList(5, 5, 4)));

        Student.processStudents(students);
        Student.printStudents(students, 2);
    }
}
