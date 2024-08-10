package keywordsAndExpression;

public class OverloadMethodChallange {
    public static void main(String[] args) {
        System.out.println("100 inch = " +convertToCentimeters(100) + " cm");
        System.out.println("10 feet 8 inch = " +convertToCentimeters(10, 8) + " cm");

        // SecondsAndMinutesChallenge   time string prints

        System.out.println("100sec ---- = " +getDurationString(3945));
        //System.out.println("150mins 100sec ---- = " +getDurationString(150, 100));

    }

    public static String getDurationString(int sec){
        if (sec < 0) {
            return "Invalid data for seconds "  + sec + " must be positive integer";
        }
        return getDurationString(sec/60, sec%60);
    }

    public static String getDurationString(int min, int sec){
        if (min < 0) {
            return "Invalid data for seconds "  + min + " must be positive integer";
        }
        if (sec <= 0 || sec >= 59) {
            return "Invalid data for seconds "  + sec + " must be positive integer between 0 to 59";
        }
        int hours = min/60;
       int remainingMinutes = min%60;
       return hours+"h "+remainingMinutes+"m "+sec+"s";
    }

    public static double convertToCentimeters(int heightInInch){
        return heightInInch * 2.54;
    }

    public static double convertToCentimeters(int heightInFeet, int heightInInch){
        int heightInch = heightInFeet*12 + heightInInch;
        return convertToCentimeters(heightInch);
    }
}

