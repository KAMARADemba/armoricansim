package fr.amu.qualite.model.werewolf;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a colony of werewolf packs.
 */
public class Colony {

    private String name;
    private List<Pack> packs;

    public Colony() {
        this.packs = new ArrayList<>();
    }

    public Colony(String name) {
        this.name = name;
        this.packs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pack> getPacks() {
        return packs;
    }

    public void addPack(Pack pack) {
        this.packs.add(pack);
    }

    public void removePack(Pack pack) {
        this.packs.remove(pack);
    }
}
