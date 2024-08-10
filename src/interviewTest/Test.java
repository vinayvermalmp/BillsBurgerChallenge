import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

    public static Map<Character, Long> countByStreamToMap(String inputList) {
        // inputList.chars().collect(Collectors.toMap((Character) Function.identity(), v -> 1L, Long::sum));
        Map<Character, Long> resultMap = new HashMap<>();
        inputList.chars().filter( c -> c == 'a' || c == 'y').forEach(e -> resultMap.merge((char) e, 1L, Long::sum));
        return resultMap;
    }

    public static Map<Integer, Long> countByForEachLoopWithMapMerge(List<Integer> inputList) {
        Map<Integer, Long> resultMap = new HashMap<>();
        inputList.stream().filter(c -> c == 10 || c == 98).forEach(e -> resultMap.merge( e, 1L, Long::sum));
        return resultMap;
    }

    public static Map<Character, Long> countByForEachLoopWithMapCompute(String inputList) {
        Map<Character, Long> resultMap = new HashMap<>();
        inputList.chars().filter( c -> c == 'a' || c == 'y').forEach(e -> resultMap.compute((char) e, (k, v) -> v == null ? 1L : v + 1L));
        return resultMap;
    }
    public static void main(String[]args){
        // int[] arr = new int[]{};
        List<Integer> numbers = Arrays.asList(10,15,8,49,25,98,98,32,15,10);
       // List<Integer> dupNum = numbers.stream().distinct().toList();
        Set<Integer> dupNum = numbers.stream().filter(x -> Collections.frequency(numbers, x) > 1)
                        .collect(Collectors.toSet());
        dupNum.forEach(System.out::println);

//
        String str = "Today is Saturday";
        // System.out.println("----" + count(str, 'a'));
        countByForEachLoopWithMapCompute(str).forEach(
                (key, value) -> System.out.println("Key : " + key + "\t Count : " + value)
        );
//        countByForEachLoopWithMapMerge(str).forEach(
//                (key, value) -> System.out.printf("Key : " + key + "\t Count : " + value)
//        );
        countByStreamToMap(str).forEach(
                (key, value) -> System.out.println("Key : " + key + "\t Count : " + value)
        );
    }
}
