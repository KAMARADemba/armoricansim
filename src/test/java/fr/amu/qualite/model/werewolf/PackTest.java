package fr.amu.qualite.model.werewolf;

import fr.amu.qualite.model.characters.Gender;
import fr.amu.qualite.model.characters.werewolves.AgeCategory;
import fr.amu.qualite.model.characters.werewolves.Rank;
import fr.amu.qualite.model.characters.werewolves.Werewolf;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for Pack.
 */
class PackTest {

    @Test
    void testPackCreation() {
        Pack pack = new Pack("Alpha Pack");
        assertNotNull(pack);
        assertEquals("Alpha Pack", pack.getName());
        assertTrue(pack.getMembers().isEmpty());
    }

    @Test
    void testAddMember() {
        Pack pack = new Pack("Alpha Pack");
        Werewolf werewolf = new Werewolf("Wolf", 100, Gender.MALE, AgeCategory.ADULT, Rank.BETA);
        pack.addMember(werewolf);
        assertEquals(1, pack.getMembers().size());
    }
}
