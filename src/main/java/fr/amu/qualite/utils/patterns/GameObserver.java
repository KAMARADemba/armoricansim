package fr.amu.qualite.utils.patterns;

/**
 * Observer interface for game events.
 */
public interface GameObserver {

    /**
     * Called when a game event occurs.
     *
     * @param event the event that occurred
     */
    void onEvent(String event);

    /**
     * Called when game state changes.
     */
    void onStateChange();
}
