package fr.amu.qualite.model.characters.gauls;

import fr.amu.qualite.model.characters.Gender;

/**
 * Represents a blacksmith character in the Gaulish village.
 */
public class Blacksmith extends Gaul {

    public Blacksmith() {
        super();
    }

    public Blacksmith(String name, int health, Gender gender) {
        super(name, health, gender);
    }
}
