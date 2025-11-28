package fr.amu.qualite.model.food;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for MagicPotion.
 */
class MagicPotionTest {

    @Test
    void testMagicPotionCreation() {
        MagicPotion potion = new MagicPotion();
        assertNotNull(potion);
        assertEquals("Magic Potion", potion.getName());
        assertEquals(100, potion.getStrengthBoost());
    }

    @Test
    void testMagicPotionWithCustomStrength() {
        MagicPotion potion = new MagicPotion(200);
        assertEquals(200, potion.getStrengthBoost());
    }
}
