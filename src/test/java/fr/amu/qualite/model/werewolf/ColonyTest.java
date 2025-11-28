package fr.amu.qualite.model.werewolf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for Colony.
 */
class ColonyTest {

    @Test
    void testColonyCreation() {
        Colony colony = new Colony("Forest Colony");
        assertNotNull(colony);
        assertEquals("Forest Colony", colony.getName());
        assertTrue(colony.getPacks().isEmpty());
    }

    @Test
    void testAddPack() {
        Colony colony = new Colony("Forest Colony");
        Pack pack = new Pack("Alpha Pack");
        colony.addPack(pack);
        assertEquals(1, colony.getPacks().size());
    }
}
