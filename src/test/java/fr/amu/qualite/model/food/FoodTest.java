package fr.amu.qualite.model.food;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for Food.
 */
class FoodTest {

    @Test
    void testFoodCreation() {
        Boar boar = new Boar();
        assertNotNull(boar);
        assertEquals("Boar", boar.getName());
        assertEquals(FoodFreshness.FRESH, boar.getFreshness());
    }
}
