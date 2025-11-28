package fr.amu.qualite.model.food;

/**
 * Represents a four leaf clover that is not fresh.
 */
public class NotFreshFourLeafClover extends Food {

    public NotFreshFourLeafClover() {
        super("Not Fresh Four Leaf Clover", FoodFreshness.NOT_FRESH);
    }
}
