package interviewTest;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test5 {


    public static void main(String[] args) {

         String str = "aaabbbbcdddddee";

        // String output = "a3b4c1d5e2
        //str.chars().collect(Collectors.toMap(Function.identity(), v -> 1L, Long::sum))
        Map<Character, Long> mapResult = new HashMap<>();
        str.chars().forEach(c -> mapResult.merge((char) c, 1L, Long::sum ) );
       // str.chars().forEach(c -> mapResult.comput);

        // nput: 1,0,6,1,8,0,2
        // output : 1,6,1,8,2,0,0

//        List list = List.of(1,0,6,1,8,0,2);
//        list.stream().map(e -> {
//            if (e == 0){
//
//            }
//        });
    }
}
