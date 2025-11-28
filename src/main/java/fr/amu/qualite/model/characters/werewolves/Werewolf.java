package fr.amu.qualite.model.characters.werewolves;

import fr.amu.qualite.model.characters.Character;
import fr.amu.qualite.model.characters.Gender;

/**
 * Represents a werewolf character.
 */
public class Werewolf extends Character {

    private AgeCategory ageCategory;
    private Rank rank;

    public Werewolf() {
        super();
    }

    public Werewolf(String name, int health, Gender gender, AgeCategory ageCategory, Rank rank) {
        super(name, health, gender);
        this.ageCategory = ageCategory;
        this.rank = rank;
    }

    public AgeCategory getAgeCategory() {
        return ageCategory;
    }

    public void setAgeCategory(AgeCategory ageCategory) {
        this.ageCategory = ageCategory;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }
}
