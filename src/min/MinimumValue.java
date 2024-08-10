package min;

import java.util.Scanner;

public class MinimumValue {

    public static void main(String[] args) {
        System.out.println("min "+findMin(readElements(readInteger())));
    }
    public static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter, how many elements the you wants to enter");
        int count = scanner.nextInt();
        return count;

    }

    public static int[] readElements(int count){
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        int[] array = new int[count];
        do{
            System.out.println("Enter number #" +counter+ " :");
            String nextNumber = sc.nextLine();
            try {
                int number = Integer.parseInt(nextNumber);
                //double number = Double.parseInt(nextNumber);
                array[counter-1] = number;
                counter++;
                // sum +=number;

            } catch (NumberFormatException nfe){
                System.out.println("Invalid number");
            }
        }while (counter <= count);
        return array;
    }

    private static int findMin(int[] array) {

        int min = Integer.MAX_VALUE;
        for (int el : array) {
            if (el < min) {
                min = el;
            }
        }

        return min;
    }


}
