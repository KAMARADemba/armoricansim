package fr.amu.qualite.utils.sorting;

import fr.amu.qualite.model.characters.werewolves.Werewolf;

import java.util.Comparator;
import java.util.List;

/**
 * Utility class for sorting werewolves.
 */
public class WerewolfSorter {

    /**
     * Sort werewolves by rank.
     *
     * @param werewolves the list of werewolves to sort
     */
    public void sortByRank(List<Werewolf> werewolves) {
        werewolves.sort(Comparator.comparing(Werewolf::getRank));
    }

    /**
     * Sort werewolves by age category.
     *
     * @param werewolves the list of werewolves to sort
     */
    public void sortByAge(List<Werewolf> werewolves) {
        werewolves.sort(Comparator.comparing(Werewolf::getAgeCategory));
    }
}
