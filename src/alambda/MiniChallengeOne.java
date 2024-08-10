package alambda;

import java.util.Arrays;
import java.util.function.Consumer;

public class MiniChallengeOne {

    public static void main(String[] args) {

        // final String sentence = "Hello! This is my first lambada program";

        Consumer<String> printsTheParts = new Consumer<String>() {
            @Override
            public void accept(String sentence) {
                String[] parts = sentence.split(" ");
                for (String part: parts) {
                    System.out.println(part);
                }
            }
        };

        Consumer<String> printPartsLambada = sentence -> {
            String[] parts = sentence.split(" ");
            for (String part: parts) {
                System.out.println(part);
            }
        };

        printsTheParts.accept("Hello! This is my first lambada program");
        printPartsLambada.accept("Hello! This is my first lambada program");

        Consumer<String> printPartsForEach = sentence -> {
            String[] parts = sentence.split(" ");
            Arrays.asList(parts).forEach(part -> System.out.println(part));
        };
        System.out.println("___".repeat(30));
        printPartsForEach.accept("Hello! This is my first lambada program");

        Consumer<String> printPartsConcise = sentence -> {
            Arrays.asList(sentence.split(" ")).forEach(part -> System.out.println(part)); // only one line code
        };
        System.out.println("___".repeat(30));
        printPartsConcise.accept("Hello! This is my first lambada program");
    }
}
