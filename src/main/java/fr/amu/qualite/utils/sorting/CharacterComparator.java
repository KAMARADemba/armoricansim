package fr.amu.qualite.utils.sorting;

import fr.amu.qualite.model.characters.Character;

import java.util.Comparator;

/**
 * Comparator for comparing characters.
 */
public class CharacterComparator implements Comparator<Character> {

    @Override
    public int compare(Character c1, Character c2) {
        if (c1 == null || c2 == null) {
            return 0;
        }
        return c1.getName().compareTo(c2.getName());
    }
}
