package fr.amu.qualite.model.characters.traits;

/**
 * Interface for characters that can lead others.
 */
public interface Leader {

    /**
     * Lead a group of characters.
     */
    void lead();

    /**
     * Give orders to subordinates.
     *
     * @param order the order to give
     */
    void giveOrder(String order);
}
