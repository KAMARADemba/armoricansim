package fr.amu.qualite.model.food;

/**
 * Represents the magical potion brewed by the druid.
 */
public class MagicPotion extends Food {

    private int strengthBoost;

    public MagicPotion() {
        super("Magic Potion", FoodFreshness.FRESH);
        this.strengthBoost = 100;
    }

    public MagicPotion(int strengthBoost) {
        super("Magic Potion", FoodFreshness.FRESH);
        this.strengthBoost = strengthBoost;
    }

    public int getStrengthBoost() {
        return strengthBoost;
    }

    public void setStrengthBoost(int strengthBoost) {
        this.strengthBoost = strengthBoost;
    }
}
