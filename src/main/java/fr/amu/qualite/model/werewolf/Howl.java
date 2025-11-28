package fr.amu.qualite.model.werewolf;

/**
 * Abstract base class for all howl types.
 */
public abstract class Howl {

    private String message;

    public Howl() {
    }

    public Howl(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Perform the howl.
     */
    public abstract void howl();
}
