import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoTest3 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 5, 6, 7, 8, 9) ;

       List<Number> list = null;
               numbers.stream().filter(i -> i%2 == 0 ).collect(Collectors.toList()).forEach(System.out::println);

              //  list.forEach(System.out::println);


    }

}
