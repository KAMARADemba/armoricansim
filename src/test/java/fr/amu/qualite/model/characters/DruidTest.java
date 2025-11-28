package fr.amu.qualite.model.characters;

import fr.amu.qualite.model.characters.gauls.Druid;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for Druid.
 */
class DruidTest {

    @Test
    void testDruidCreation() {
        Druid druid = new Druid("Panoramix", 100, Gender.MALE);
        assertNotNull(druid);
        assertEquals("Panoramix", druid.getName());
        assertEquals(100, druid.getHealth());
        assertEquals(Gender.MALE, druid.getGender());
    }
}
