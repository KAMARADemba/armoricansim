package fr.amu.qualite.model.characters.traits;

/**
 * Interface for characters that can engage in combat.
 */
public interface Combatant {

    /**
     * Attack another combatant.
     *
     * @param target the target to attack
     */
    void attack(Combatant target);

    /**
     * Defend against an attack.
     *
     * @param damage the amount of damage to defend against
     */
    void defend(int damage);
}
