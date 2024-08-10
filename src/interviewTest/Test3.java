import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test3 {

    //String[] names = new String[]
    public static Map<String, Integer> strMethod(List<String> list){
         list.stream().collect(Collectors.toMap(Function.identity(), v -> 1, Integer::sum)).forEach(
                (key, value) -> System.out.println("Key : " + key + "\t Count : " + value));
        return null;
    }
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Sachin");
        list.add("Meera");
        list.add("Virat");
        list.add("Sachin");
        list.add("Virat");
        strMethod(list);

    }
}
