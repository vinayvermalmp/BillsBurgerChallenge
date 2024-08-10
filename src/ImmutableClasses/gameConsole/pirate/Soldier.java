package ImmutableClasses.gameConsole.pirate;

import java.util.Map;

public final class Soldier extends Combatant{
    public Soldier(String name, Weapon weapon) {
        super(name);
        setCurrentWeapon(weapon);
    }
}
