package fr.amu.qualite.model.werewolf;

import fr.amu.qualite.model.characters.werewolves.Werewolf;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a pack of werewolves.
 */
public class Pack {

    private String name;
    private AlphaCouple alphaCouple;
    private List<Werewolf> members;

    public Pack() {
        this.members = new ArrayList<>();
    }

    public Pack(String name) {
        this.name = name;
        this.members = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AlphaCouple getAlphaCouple() {
        return alphaCouple;
    }

    public void setAlphaCouple(AlphaCouple alphaCouple) {
        this.alphaCouple = alphaCouple;
    }

    public List<Werewolf> getMembers() {
        return members;
    }

    public void addMember(Werewolf werewolf) {
        this.members.add(werewolf);
    }

    public void removeMember(Werewolf werewolf) {
        this.members.remove(werewolf);
    }
}
