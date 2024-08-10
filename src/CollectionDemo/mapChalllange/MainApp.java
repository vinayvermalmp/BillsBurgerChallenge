package CollectionDemo.mapChalllange;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

//        AdventureGame adventureGame = new AdventureGame();
//        adventureGame.play("road");

        String myLocations = """
                lake,at the edge of Lake Tim,E:ocean,W:forest,S:well house,N:cave
                ocean,on Tim's beach before an angry sea,W:lake
                cave,at the mouth of Tim's bat cave,E:ocean,W:forest,S:lake
                """;
        AdventureGame adventureGame = new AdventureGame(myLocations);
        adventureGame.play("lake");



        Scanner scanner = new Scanner(System.in);

        while (true) {
            String direction = scanner.nextLine().trim().toUpperCase().substring(0, 1);
            if (direction.equals("Q")) break;
            adventureGame.move(direction);
        }
    }
}
