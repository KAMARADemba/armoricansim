package fr.amu.qualite.model.characters.traits;

/**
 * Interface for characters that can perform work.
 */
public interface Worker {

    /**
     * Perform work.
     */
    void work();

    /**
     * Rest after working.
     */
    void rest();
}
