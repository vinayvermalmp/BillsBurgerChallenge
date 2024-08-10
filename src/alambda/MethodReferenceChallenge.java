package alambda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.UnaryOperator;

public class MethodReferenceChallenge {

    private static Random random = new Random();

    private record Person(String first){

        public String last(String s) {
            return first+" "+s.substring(0 , s.indexOf(" "));
        }
    }
    public static void main(String[] args) {
        String[] names = {"Anna", "Bob", "David", "Carol", "Ed","Fred"};

        Person tim = new Person("Tim");

        List<UnaryOperator<String>> operatorList = new ArrayList<>(List.of(
                String::toUpperCase,
                s -> s += " "+getRandomChar('D', 'M')+".",
                s -> s +=" "+getReversed(s, 0, s.indexOf(" ")),
                MethodReferenceChallenge::getReversed,
                String::new,
                // s -> new String("Howdy" +s)
                String::valueOf,
                tim::last,
                (new Person("Marry"))::last

        ));
        applyChanges(names, operatorList);
    }

    public static void applyChanges(String[] names, List<UnaryOperator<String>> stringFunctions){
        List<String> backedByArray = Arrays.asList(names);
        for (var function : stringFunctions) {
            backedByArray.replaceAll(s -> s.transform(function));
            System.out.println(Arrays.toString(names));
        }
    }

    public static char getRandomChar(char startChar, char endChar){
        return (char) random.nextInt((int) startChar, (int) endChar+1);
    }

    public static String getReversed(String firstName){
        return new StringBuilder(firstName).reverse().toString();
    }
    public static String getReversed(String firstName, int start, int end){
        return new StringBuilder(firstName.substring(start, end)).reverse().toString();
    }
}
