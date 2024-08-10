package interfaceDemo.example;

public class ExampleMAin {

    public static void main(String[] args) {
        Player player = new Player("Tim", 10, 10);
        System.out.println(player.toString());
        player.setWeapon(player.getWeapon());
        saveObject(player);
        player.setHitPoints(8);
        saveObject(player);

        System.out.println(player);

        ISaveable monster = new Monster("Monster", 10, 10);
        System.out.println(monster);
        saveObject(monster);
    }

    public static void saveObject(ISaveable objectToSave){
        for (String s : objectToSave.write()) {
            System.out.println("Saving" + s);
        }
    }
}
