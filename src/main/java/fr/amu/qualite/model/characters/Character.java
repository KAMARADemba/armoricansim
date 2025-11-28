package fr.amu.qualite.model.characters;

/**
 * Abstract base class for all characters in the game.
 */
public abstract class Character {

    private String name;
    private int health;
    private Gender gender;

    public Character() {
    }

    public Character(String name, int health, Gender gender) {
        this.name = name;
        this.health = health;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
