package fr.amu.qualite.model.characters.gauls;

import fr.amu.qualite.model.characters.Gender;

/**
 * Represents a merchant character in the Gaulish village.
 */
public class Merchant extends Gaul {

    public Merchant() {
        super();
    }

    public Merchant(String name, int health, Gender gender) {
        super(name, health, gender);
    }
}
