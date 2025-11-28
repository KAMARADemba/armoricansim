package fr.amu.qualite.model.food;

/**
 * Represents fish that is not fresh.
 */
public class NotFreshFish extends Food {

    public NotFreshFish() {
        super("Not Fresh Fish", FoodFreshness.NOT_FRESH);
    }
}
