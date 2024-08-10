package keywordsAndExpression;

public class MAinChallange {
    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim ", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Bob ", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Precy ", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Gilbert ", highScorePosition);

        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("James ", highScorePosition);

        printConversion(1.5);
        printConversion(-2.00);
        printConversion(-25.0);
        printConversion(-10.0);
    }

    public static void displayHighScorePosition(String name, int highScorePosition){
        System.out.println(name +"managed to get into position " +highScorePosition+ " on the high score list");
    }
    public static int calculateHighScorePosition(int score){

        int position = 4;
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500){
            position = 2;
        }else if (score >= 100) {
            position = 3;
        }
        return position;
    }

    public static long toMilesPerHour(double kilometersPerHour){

        if (kilometersPerHour > 0 || kilometersPerHour == 0) {
            double mph = Math.round(kilometersPerHour/1.609);
            return (long)mph;
        }
        return -1;

    }

    public static void printConversion(double kilometersPerHour){
        if (toMilesPerHour(kilometersPerHour) < 0) {
            System.out.println("Invalid Value");
        } else {
            double mph = kilometersPerHour / 1.609;
            long mphRounder = (long) Math.round(mph);
            System.out.println(kilometersPerHour + " km/h = " + mphRounder + " mi/h");
        }

    }

}
