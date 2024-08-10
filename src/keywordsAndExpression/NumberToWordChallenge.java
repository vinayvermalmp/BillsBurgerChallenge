package keywordsAndExpression;

public class NumberToWordChallenge {

    public static void main(String[] args) {
        numberToWords(9);
        numberToWords(0);
        numberToWords(1);
        numberToWords(101);
    }

    public static void numberToWords(int number){
        if (number < 0){
            System.out.println("Invalid Value");
            return;
        }
        int digitCount = getDigitCount(number);
        int tempRev = reverse(number);
        StringBuilder numberToWord = new StringBuilder();
        while(digitCount != 0){
            int digit = tempRev%10;
            String noInWord = "";
            switch(digit) {
                case 0: noInWord ="Zero";
                    break;
                case 1: noInWord ="One";
                    break;
                case 2: noInWord ="Two";
                    break;
                case 3: noInWord ="Three";
                    break;
                case 4: noInWord ="Four";
                    break;
                case 5: noInWord ="Five";
                    break;
                case 6: noInWord ="Six";
                    break;
                case 7: noInWord ="Seven";
                    break;
                case 8: noInWord ="Eight";
                    break;
                case 9: noInWord ="Nine";
                    break;
            };

            numberToWord.append(noInWord).append(" ");
            digitCount--;
            tempRev /=10;
        }
        System.out.println(numberToWord);

    }

    public static int getDigitCount(int number){
        if (number < 0){
            return -1;
        }
        int count = 1;
        while(number > 9){
            int digit =number%10;
            count++;
            number = number/10;
        }
        return count;
    }

    public static int reverse(int number){
        int reversedNumber = 0;
        while(number != 0){
            reversedNumber = reversedNumber*10 + number%10;
            number = number/10;
        }
        return reversedNumber;
    }
}
