package fr.amu.qualite.model.characters.gauls;

import fr.amu.qualite.model.characters.Character;
import fr.amu.qualite.model.characters.Gender;

/**
 * Base class for all Gaulish characters.
 */
public abstract class Gaul extends Character {

    public Gaul() {
        super();
    }

    public Gaul(String name, int health, Gender gender) {
        super(name, health, gender);
    }
}
