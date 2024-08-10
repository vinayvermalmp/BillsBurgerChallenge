
package keywordsAndExpression;

public class ThePrimeNumberChallenge {

    public static void main(String[] args) {
        int count = 0;

        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime number");
                count++;
                if (count == 3){
                    break;
                }
            }
        }
        System.out.println("total prime no between 10 and 50 " + count);
        
        /* -------------------------------------*/
        int sum = 0;
        int count1 = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i%15 == 0) {
                sum +=i;
                System.out.println(i +" divisible by 15 and sum of num "+ sum);
                count1++;
                if (count1 == 5) {
                    break;
                }
            }
        }
        System.out.println("total no divisible by 15  between 1 and 1000 " + count1);
        System.out.println("get largest prime factor " +getLargestPrime(21));
        System.out.println("get largest prime factor " +getLargestPrime(121));
        System.out.println("get largest prime factor " +getLargestPrime(243));
        System.out.println("get largest prime factor " +getLargestPrime(7));
    }


    public static int getLargestPrime(int number){
        if (number < 0) {
            return -1;
        }
        int i = 2;
        while(i < number){
            if (number%i == 0){
                System.out.print(i + " ");
                number /=i;
                i--;
            }
            i++;
        }
        return number;
    }

    public static boolean isPrime(int number){
        if ( number <= 2) {
            return (number == 2);
        }
        for (int divisor = 2; divisor < number/2 ; divisor++) {
            if(number % divisor ==0){
                return false;
            }
        }
        return true;
    }

}
