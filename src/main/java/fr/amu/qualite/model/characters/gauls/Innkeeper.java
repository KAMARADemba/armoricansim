package fr.amu.qualite.model.characters.gauls;

import fr.amu.qualite.model.characters.Gender;

/**
 * Represents an innkeeper character in the Gaulish village.
 */
public class Innkeeper extends Gaul {

    public Innkeeper() {
        super();
    }

    public Innkeeper(String name, int health, Gender gender) {
        super(name, health, gender);
    }
}
