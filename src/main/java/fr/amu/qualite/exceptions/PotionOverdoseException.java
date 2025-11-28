package fr.amu.qualite.exceptions;

/**
 * Exception thrown when a character consumes too much potion.
 */
public class PotionOverdoseException extends Exception {

    public PotionOverdoseException() {
        super();
    }

    public PotionOverdoseException(String message) {
        super(message);
    }

    public PotionOverdoseException(String message, Throwable cause) {
        super(message, cause);
    }
}
