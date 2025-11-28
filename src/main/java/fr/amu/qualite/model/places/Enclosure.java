package fr.amu.qualite.model.places;

/**
 * Represents an enclosure for werewolves.
 */
public class Enclosure extends Place {

    public Enclosure() {
        super("Enclosure", 50);
    }

    public Enclosure(String name, int capacity) {
        super(name, capacity);
    }
}
