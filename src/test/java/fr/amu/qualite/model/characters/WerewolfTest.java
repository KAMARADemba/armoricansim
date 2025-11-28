package fr.amu.qualite.model.characters;

import fr.amu.qualite.model.characters.werewolves.AgeCategory;
import fr.amu.qualite.model.characters.werewolves.Rank;
import fr.amu.qualite.model.characters.werewolves.Werewolf;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for Werewolf.
 */
class WerewolfTest {

    @Test
    void testWerewolfCreation() {
        Werewolf werewolf = new Werewolf("Alpha", 150, Gender.MALE, AgeCategory.ADULT, Rank.ALPHA);
        assertNotNull(werewolf);
        assertEquals("Alpha", werewolf.getName());
        assertEquals(150, werewolf.getHealth());
        assertEquals(Gender.MALE, werewolf.getGender());
        assertEquals(AgeCategory.ADULT, werewolf.getAgeCategory());
        assertEquals(Rank.ALPHA, werewolf.getRank());
    }
}
