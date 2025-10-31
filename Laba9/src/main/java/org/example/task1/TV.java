package org.example.task1;

public class TV extends Electronic {
    public TV(String model) {
        super(model);
    }
    @Override
    public String toString() {
        return "TV [model=" + getModel() + "]";
    }
}
