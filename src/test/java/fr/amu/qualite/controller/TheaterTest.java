package fr.amu.qualite.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for Theater.
 */
class TheaterTest {

    @Test
    void testTheaterCreation() {
        Theater theater = new Theater();
        assertNotNull(theater);
    }
}
