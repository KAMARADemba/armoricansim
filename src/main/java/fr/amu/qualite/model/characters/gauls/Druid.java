package fr.amu.qualite.model.characters.gauls;

import fr.amu.qualite.model.characters.Gender;

/**
 * Represents a druid character who can create magic potions.
 */
public class Druid extends Gaul {

    public Druid() {
        super();
    }

    public Druid(String name, int health, Gender gender) {
        super(name, health, gender);
    }
}
