package fr.amu.qualite.exceptions;

/**
 * Exception thrown when pack hierarchy rules are violated.
 */
public class PackHierarchyException extends Exception {

    public PackHierarchyException() {
        super();
    }

    public PackHierarchyException(String message) {
        super(message);
    }

    public PackHierarchyException(String message, Throwable cause) {
        super(message, cause);
    }
}
