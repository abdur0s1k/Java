package org.example.exceptions;

public class OkladException extends Exception {
    private final double invalidOklad;

    public OkladException(String message, double oklad) {
        super(message);
        this.invalidOklad = oklad;
    }

    public OkladException(String message, double oklad, Throwable cause) {
        super(message, cause);
        this.invalidOklad = oklad;
    }

    public double getInvalidOklad() {
        return invalidOklad;
    }
}
