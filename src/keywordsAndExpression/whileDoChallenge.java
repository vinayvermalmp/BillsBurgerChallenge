package keywordsAndExpression;

public class whileDoChallenge {
    public static void main(String[] args) {

        System.out.println("sumFirstAndLastDigit "+ sumFirstAndLastDigit(12345));

        System.out.println("sumFirstAndLastDigit "+ sumFirstAndLastDigit(5));

        System.out.println("sumFirstAndLastDigit "+ sumFirstAndLastDigit(10));

        System.out.println("sumFirstAndLastDigit "+ sumFirstAndLastDigit(-554));
//   -----------------------------------------------------------
        System.out.println(hasSharedDigit(8, 101));

        System.out.println(hasSharedDigit(15, 95));

        System.out.println(hasSharedDigit(18, 105));

        System.out.println(hasSharedDigit(19, 99));

        System.out.println(hasSharedDigit(12, 43));

        //   -----------------------------------------------------------
        System.out.println("//////////////////////////////////////////////////////");
        System.out.println(hasSameLastDigit(10, 10, 10));

        System.out.println(hasSameLastDigit(15, 95, 67));

        System.out.println(hasSameLastDigit(18, 105, 345));

        System.out.println(hasSameLastDigit(17, 99, 89));

        System.out.println(hasSameLastDigit(12, 43, 67));
    }


    public static boolean hasSameLastDigit(int number1 , int number2, int number3){

        if (!isValid(number1) || !isValid(number2) || !isValid(number3)){
            return false;
        }

        boolean sameLastDigit = false;
        while(number1 > 9){
            int lastDigit1 = number1%10;
            number1 = number1/10;
            int temp = number2;
            while(number2 > 9){
                int lastDigit2 = number2%10;
                number2 = number2/10;
                if(lastDigit1 == lastDigit2){
                    sameLastDigit = true;
                    break;
                }
                while(number3 > 9){
                    int lastDigit3 = number3%10;
                    number3 = number3/10;
                    if(lastDigit2 == lastDigit3){
                        sameLastDigit = true;
                        break;
                    } else if (lastDigit1 == lastDigit3) {
                        sameLastDigit = true;
                        break;
                    }
                }
            }



        }

        return sameLastDigit;
    }

    public static boolean isValid(int number){
        if(number < 10 || number > 1000){
            return false;
        }
        return true;
    }



    public static boolean hasSharedDigit(int number1 , int number2){

        if ((number1 < 10 || number1 > 99) || (number2 < 10 || number2 > 99)){
            return false;
        }

        boolean matchFound = false;
        while(number1 != 0){
            int digitInNumber1 = number1%10;
            number1 = number1/10;
            int temp = number2;
            while(temp != 0){
                int digitInNumber2 = temp%10;
                temp = temp/10;
                if(digitInNumber1 == digitInNumber2){
                    matchFound = true;
                    System.out.println(number2 + " ---- " +digitInNumber2);
                    break;
                }
            }
        }
        return matchFound;
    }


    public static int sumFirstAndLastDigit (int number){
        if (number < 0){
            return -1;
        }
        int sum = 0;
        if (number < 10){
            sum =number + number;
            return sum;
        }
        int count=0;
        do {
            count++;
            if(count == 1){
                sum +=number%10;
            }
            number = number/10;
            continue;
        } while(number > 9 );
        sum +=number;
        return sum;
    }

    /*public static int sumFirstAndLastDigit (int number){
        if (number < 0){
            return -1;
        }
        int sum = 0;
        if (number < 10){
            sum =number + number;
            return sum;
        }
        int count=0;
        while(number > 9){
            count++;
            if(count == 1){
                sum +=number%10;
            }
            number = number/10;
            continue;
        }
        sum +=number;
        return sum;
    }*/
}
