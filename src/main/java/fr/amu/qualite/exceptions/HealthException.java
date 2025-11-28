package fr.amu.qualite.exceptions;

/**
 * Exception thrown when a health-related error occurs.
 */
public class HealthException extends Exception {

    public HealthException() {
        super();
    }

    public HealthException(String message) {
        super(message);
    }

    public HealthException(String message, Throwable cause) {
        super(message, cause);
    }
}
