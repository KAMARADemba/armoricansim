package fr.amu.qualite.model.places;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for Place.
 */
class PlaceTest {

    @Test
    void testGaulishVillageCreation() {
        GaulishVillage village = new GaulishVillage();
        assertNotNull(village);
        assertEquals("Gaulish Village", village.getName());
        assertEquals(100, village.getCapacity());
    }

    @Test
    void testRomanCampCreation() {
        RomanCamp camp = new RomanCamp();
        assertNotNull(camp);
        assertEquals("Roman Camp", camp.getName());
        assertEquals(200, camp.getCapacity());
    }
}
