package org.example;

public class Table implements Furniture {
    @Override
    public void assemble() {
        System.out.println("Собирается стол.");
    }
}
