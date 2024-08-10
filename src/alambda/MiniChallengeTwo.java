package alambda;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class MiniChallengeTwo {
    public static void main(String[] args) {
        // directly calling method
        System.out.println(everySecondChar("Hello! this is my home" ));
       // Function<String, String> everySecondChar = source -> {
        UnaryOperator<String> everySecondCharLambada = source -> {
            // unaryOperator is a special type function, has same args type and return type
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i <source.length() ; i++) {
                if (i%2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };
        String result =  everySecondCharLambada.apply("Hello! this is my home");
        System.out.println(result);

        //
        String result1 = everySecondCharacter(everySecondCharLambada, "123456789");
        System.out.println("__".repeat(30));
        System.out.println(result1);

        //----------------------
        Supplier<String> iLoveJava = () -> "I love to Java";
        Supplier<String> iLoveJava2 = () -> { return "I love to Java";};

        System.out.println(iLoveJava.get());
        System.out.println(iLoveJava2.get());

    }

    public static String everySecondChar(String source){
        StringBuilder returnVal = new StringBuilder();
        for (int i = 0; i <source.length() ; i++) {
            if (i%2 == 1) {
                returnVal.append(source.charAt(i));
            }
        }
       return returnVal.toString();
    }

    public static String everySecondCharacter(Function<String, String> func, String source){
        return func.apply(source);
    }
}
