package fr.amu.qualite.model.characters.romans;

import fr.amu.qualite.model.characters.Character;
import fr.amu.qualite.model.characters.Gender;

/**
 * Base class for all Roman characters.
 */
public abstract class Roman extends Character {

    public Roman() {
        super();
    }

    public Roman(String name, int health, Gender gender) {
        super(name, health, gender);
    }
}
