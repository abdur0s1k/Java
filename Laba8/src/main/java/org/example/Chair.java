package org.example;

public class Chair implements Furniture{
    @Override
    public void assemble() {
        System.out.println("Собирается стул.");
    }
}

