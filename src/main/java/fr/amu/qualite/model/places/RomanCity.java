package fr.amu.qualite.model.places;

/**
 * Represents a Roman city.
 */
public class RomanCity extends Place {

    public RomanCity() {
        super("Roman City", 1000);
    }

    public RomanCity(String name, int capacity) {
        super(name, capacity);
    }
}
