package fr.amu.qualite.utils;

import fr.amu.qualite.model.characters.Gender;
import fr.amu.qualite.model.characters.werewolves.AgeCategory;
import fr.amu.qualite.model.characters.werewolves.Rank;
import fr.amu.qualite.model.characters.werewolves.Werewolf;
import fr.amu.qualite.utils.sorting.WerewolfSorter;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for WerewolfSorter.
 */
class WerewolfSorterTest {

    @Test
    void testSortByRank() {
        WerewolfSorter sorter = new WerewolfSorter();
        List<Werewolf> werewolves = new ArrayList<>();
        werewolves.add(new Werewolf("Beta", 100, Gender.MALE, AgeCategory.ADULT, Rank.BETA));
        werewolves.add(new Werewolf("Alpha", 100, Gender.MALE, AgeCategory.ADULT, Rank.ALPHA));

        sorter.sortByRank(werewolves);

        assertEquals(Rank.ALPHA, werewolves.get(0).getRank());
    }
}
