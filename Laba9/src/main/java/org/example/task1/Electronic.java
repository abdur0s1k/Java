package org.example.task1;

public class Electronic {
    private String model;

    public Electronic(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [model=" + model + "]";
    }
}