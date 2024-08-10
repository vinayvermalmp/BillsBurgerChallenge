package keywordsAndExpression;
import java.util.Scanner;

public class UserInputChallenge {

    public static void main(String[] args) {
        // public  static void getSumOfUserInput(){
            Scanner sc = new Scanner(System.in);
            int counter = 1;
            double sum = 0;
            do{
                System.out.println("Enter number #" +counter+ " :");
                String nextNumber = sc.nextLine();
                try {
                //    int number = Integer.parseInt(nextNumber);
                    double number = Double.parseDouble(nextNumber);
                    counter++;
                    sum +=number;
                } catch (NumberFormatException nfe){
                    System.out.println("Invalid number");
                }
            }while (counter <= 5);
        System.out.println("The sum of five numbers "+sum);

       // }
    }


}
