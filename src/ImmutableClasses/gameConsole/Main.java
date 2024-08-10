package ImmutableClasses.gameConsole;

import ImmutableClasses.gameConsole.pirate.Pirate;
import ImmutableClasses.gameConsole.pirate.PirateGame;
import ImmutableClasses.gameConsole.pirate.Town;
import ImmutableClasses.gameConsole.pirate.Weapon;

public class Main {
    public static void main(String[] args) {
//        var console = new GameConsole<>(new ShooterGame("The shootout game"));
//        int playerIndex = console.addPlayer();
//        console.playGame(playerIndex);
//        Weapon weapon = Weapon.getWeaponByChar('P');
//        System.out.println("Weapon = " + weapon + ", hitPoints=" +
//                weapon.getHitPoints() + ", minLevel=" + weapon.getMinLevel());
//
//        var list = Weapon.getWeaponsByLevel(1);
//        list.forEach(System.out::println);
//
//        Pirate tim = new Pirate("Tim");
//        System.out.println(tim);
//
//        PirateGame.getTowns(0).forEach(t -> System.out.println(t.information()));
//        System.out.println("---------------------------");
//        PirateGame.getTowns(1).forEach(t -> System.out.println(t.information()));
//        Town bridgeTown = new Town("Bridge Town", "Barbados", 0);
//        System.out.println(bridgeTown);
//        System.out.println(bridgeTown.information())

        var console = new GameConsole<>(new PirateGame("The Pirate Game"));
        int playerIndex = console.addPlayer();
        console.playGame(playerIndex);

        ;




    }
}
