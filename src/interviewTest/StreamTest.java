package interviewTest;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {
        String input = "Java articles are Awesome";
        //Arrays.stream(input.toCharArray());
        Stream.of(input.toCharArray()).forEach(System.out::println );

    }
}
