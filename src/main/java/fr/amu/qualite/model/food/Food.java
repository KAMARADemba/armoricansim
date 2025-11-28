package fr.amu.qualite.model.food;

/**
 * Abstract base class for all food items.
 */
public abstract class Food {

    private String name;
    private FoodFreshness freshness;

    public Food() {
    }

    public Food(String name, FoodFreshness freshness) {
        this.name = name;
        this.freshness = freshness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FoodFreshness getFreshness() {
        return freshness;
    }

    public void setFreshness(FoodFreshness freshness) {
        this.freshness = freshness;
    }
}
