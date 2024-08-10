package alambda;

import java.util.*;
import java.util.function.Supplier;

public class MiniChallengeThree {

    private static Random random= new Random();
    public static void main(String[] args) {

        String[] names = {"Anna", "Bob", "David", "Carol", "Ed","Fred"};
        Arrays.setAll(names, i -> names[i].toUpperCase());
        System.out.println("---- transform to upper case");
        System.out.println(Arrays.toString(names));

        List<String> backedByArray = Arrays.asList(names);

        backedByArray.replaceAll(s -> s += " "+getRandomChar('A','D')+ ".");
        System.out.println("------Add random middle initial");
        System.out.println(Arrays.toString(names));

        backedByArray.replaceAll(s -> s += " "+getReversed(s.split(" ")[0]));
        System.out.println("------Add reverse name as last name");
        Arrays.asList(names).forEach(s -> System.out.println(s));

        List<String> newList = new ArrayList<>(List.of(names));
        //newList.removeIf(s -> s.substring(0, s.indexOf(" ")).equals(s.substring(s.lastIndexOf(" ")+1)));
        newList.removeIf(s -> {
          String first =  s.substring(0, s.indexOf(" "));
          String last = s.substring(s.lastIndexOf(" ")+1);
          return first.equals(last);
        });
        System.out.println("---------- Remove name where first = last");
        newList.forEach(s -> System.out.println(s));
    }

    public static char getRandomChar(char startChar, char endChar){
        return (char) random.nextInt((int) startChar, (int) endChar+1);
    }
    public static String getReversed(String firstName){
        return new StringBuilder(firstName).reverse().toString();
    }
}
