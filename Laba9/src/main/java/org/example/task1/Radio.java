package org.example.task1;

public class Radio extends Electronic {
    public Radio(String model) {
        super(model);
    }
    @Override
    public String toString() {
        return "Radio [model=" + getModel() + "]";
    }
}
