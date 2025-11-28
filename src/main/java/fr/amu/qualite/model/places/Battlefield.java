package fr.amu.qualite.model.places;

/**
 * Represents a battlefield where battles take place.
 */
public class Battlefield extends Place {

    public Battlefield() {
        super("Battlefield", 1000);
    }

    public Battlefield(String name, int capacity) {
        super(name, capacity);
    }
}
