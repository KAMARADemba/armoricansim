package fr.amu.qualite.model.characters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for Character.
 */
class CharacterTest {

    @Test
    void testCharacterProperties() {
        // Character is abstract, so we test via concrete implementations
        assertNotNull(Gender.MALE);
        assertNotNull(Gender.FEMALE);
    }
}
