package org.example;

public class Chair extends Furniture {
    @Override
    public void assemble() {
        System.out.println("Собираем стул: прикручиваем ножки, спинку и сиденье.");
    }
}
