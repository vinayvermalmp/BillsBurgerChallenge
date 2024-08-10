package keywordsAndExpression;

public class DigitSumChallenge {

    public static void main(String[] args) {
        System.out.println("Sum of digits " +sumDigits(125));
    }
    public static int sumDigits(int num){
        if (num <= 0) {
            return -1;
        }
        int temp = num;
        int sum = 0;
        int digitCount = 1;
        while (num > 9){
            sum += num%10;
            num = num/10;
           digitCount++;
        }
        sum += num;
        System.out.println("total no digits in " +temp+ " is "+ digitCount);
        return sum;
    }
}
