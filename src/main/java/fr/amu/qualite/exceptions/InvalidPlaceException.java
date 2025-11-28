package fr.amu.qualite.exceptions;

/**
 * Exception thrown when an invalid place is accessed or referenced.
 */
public class InvalidPlaceException extends Exception {

    public InvalidPlaceException() {
        super();
    }

    public InvalidPlaceException(String message) {
        super(message);
    }

    public InvalidPlaceException(String message, Throwable cause) {
        super(message, cause);
    }
}
