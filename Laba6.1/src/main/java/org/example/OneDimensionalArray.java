package org.example;

public class OneDimensionalArray {
    private ArrayElement[] elements;

    // Создать массив
    public void create(int size) {
        elements = new ArrayElement[size];
        for (int i = 0; i < size; i++) {
            elements[i] = new ArrayElement(i + 1); // Заполняем числами 1..size
        }
    }

    // Вывести на консоль
    public void print() {
        System.out.print("Элементы массива: ");
        for (ArrayElement e : elements) {
            System.out.print(e.getValue() + " ");
        }
        System.out.println();
    }

    // Операции
    public void add(int value) {
        for (ArrayElement e : elements) {
            e.setValue(e.getValue() + value);
        }
    }

    public void subtract(int value) {
        for (ArrayElement e : elements) {
            e.setValue(e.getValue() - value);
        }
    }

    public void multiply(int value) {
        for (ArrayElement e : elements) {
            e.setValue(e.getValue() * value);
        }
    }
}
