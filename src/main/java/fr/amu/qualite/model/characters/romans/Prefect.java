package fr.amu.qualite.model.characters.romans;

import fr.amu.qualite.model.characters.Gender;

/**
 * Represents a Roman prefect character.
 */
public class Prefect extends Roman {

    public Prefect() {
        super();
    }

    public Prefect(String name, int health, Gender gender) {
        super(name, health, gender);
    }
}
