package fr.amu.qualite.model.werewolf;

import fr.amu.qualite.model.characters.werewolves.Werewolf;

/**
 * Represents the alpha couple leading a pack.
 */
public class AlphaCouple {

    private Werewolf alphaMale;
    private Werewolf alphaFemale;

    public AlphaCouple() {
    }

    public AlphaCouple(Werewolf alphaMale, Werewolf alphaFemale) {
        this.alphaMale = alphaMale;
        this.alphaFemale = alphaFemale;
    }

    public Werewolf getAlphaMale() {
        return alphaMale;
    }

    public void setAlphaMale(Werewolf alphaMale) {
        this.alphaMale = alphaMale;
    }

    public Werewolf getAlphaFemale() {
        return alphaFemale;
    }

    public void setAlphaFemale(Werewolf alphaFemale) {
        this.alphaFemale = alphaFemale;
    }
}
