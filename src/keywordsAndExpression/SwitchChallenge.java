
package keywordsAndExpression;

public class SwitchChallenge {
    public static void main(String[] args) {
        printDayOfWeak(0);
        printDayOfWeak(1);
        printDayOfWeak(2);
        printDayOfWeak(3);
        printDayOfWeak(4);
        printDayOfWeak(5);
        printDayOfWeak(6);

        /* -----------------------------*/
        printNumberInWord(0);
        printNumberInWord(1);
        printNumberInWord(2);
        printNumberInWord(3);
        printNumberInWord(4);
        printNumberInWord(5);
        printNumberInWord(6);
        printNumberInWord(7);
        printNumberInWord(8);
        printNumberInWord(9);
        printNumberInWord(10);

        System.out.println("----  " + getDaysInMonth(2, 2020));
    }


        // write your code here
        public static boolean isLeapYear (int year){
            if (year >= 1 && year <= 9999 ){
                if(year%4 == 0){
                    if(year%100 == 0){
                        if(year%400 == 0){
                            return true;
                        }
                    }else{
                        return true;
                    }
                }
            }
            return false;
        }

        public static int getDaysInMonth(int month, int year){

            if (month < 1 || month > 12 ){
                return -1;
            }
            if (year < 1 || year > 9999 ){
                return -1;
            }
            System.out.println(year + "is Leap Year  = " + isLeapYear(year));
            switch(month) {
                case 1: case 3: case 7: case 8: case 10: case 12:
                    return 31;
                case 2:
                    if (isLeapYear(year)) {
                        return 29;
                    }else {
                        return 28;
                    }
                case 4: case 6: case 9: case 11:
                default :
                    return 31;
            }
           // return daysOfMonth;
        }

    private static void printDayOfWeak(int day) {
      String dayOfWeak =  switch (day) {
            case 0 -> { yield  "Sunday"; }
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };
        System.out.println(day + " stands for "+ dayOfWeak);
    }

    public static void printNumberInWord(int num){

        String noInWord = switch(num) {
            case 0 -> "ZERO";
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            default -> "OTHER";
        };
        System.out.println(num+" stands for " +noInWord);
    }





}
