package fr.amu.qualite.model.characters.romans;

import fr.amu.qualite.model.characters.Gender;

/**
 * Represents a Roman legionary soldier.
 */
public class Legionary extends Roman {

    public Legionary() {
        super();
    }

    public Legionary(String name, int health, Gender gender) {
        super(name, health, gender);
    }
}
