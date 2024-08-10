package keywordsAndExpression;

import java.util.Scanner;

public class MInMaxChallenge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int counter = 1;
        double sum = 0;
        double avg = 0;
        while (true) {
            // System.out.println("Enter number #" +counter+ ":");
                String nextNumber = sc.nextLine();
                try {
                    int number = Integer.parseInt(nextNumber);
                    //   double number = Double.parseDouble(nextNumber);
                    sum +=number;
                    System.out.println(counter );
                    avg = sum/(double)counter;
                    counter++;
                } catch (NumberFormatException nfe){
                    // System.out.println("Invalid number");
                    break;
                }
        }
        System.out.println("SUM = "+((long) Math.round(sum))+" AVG = "+((long) Math.round(avg)));

//        Scanner scanner = new Scanner(System.in);
//        double max = 0;
//        double min = 0;
//        int loopCount = 0;
//        while (true) {
//            System.out.println("Enter a number, or any character to exit");
//            String nextEntry = scanner.nextLine();
//            try {
//                double validNumber = Double.parseDouble(nextEntry);
//                if (loopCount == 0 || validNumber <  min) {
//                    min = validNumber;
//                }
//                if (loopCount == 0 || validNumber >  max) {
//                    max = validNumber;
//                }
//                loopCount++;
//            }catch (NumberFormatException nfe) {
//                break;
//            }
//        }
//        if (loopCount > 0) {
//            System.out.println("min = "+ min +" max" + max);
//        }else {
//            System.out.println("No valid data entered");
//        }
    }
}
