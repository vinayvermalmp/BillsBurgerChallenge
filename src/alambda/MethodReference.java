package alambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

class PlainOld{
    private static int last_id = 1;
    private int id;
    public PlainOld(){
        id = PlainOld.last_id++;
        System.out.println("Creating a PlaneOld object id "+id);
    }
}
public class MethodReference {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("Anna", "Bob", "David", "Carol", "Ed","Fred"));
        list.forEach(System.out::println);

        int result = calculator(Integer::sum, 5,2);
        double result2 = calculator(Double::sum, 10.0,2.5);

        Supplier<PlainOld> plainOldSupplier = PlainOld::new;
        PlainOld plainOld = plainOldSupplier.get();

        System.out.println("Getting an array");
        PlainOld[] plainOld1 = seedArray(plainOldSupplier, 10);

    }

    public static <T> T calculator(BinaryOperator<T> function, T value1, T value2){
        T result = function.apply(value1,value2);
        System.out.println("Results of operation: "+ result );
        return result;
    }

    public static PlainOld[] seedArray(Supplier<PlainOld> reference, int count){
        PlainOld[] array = new PlainOld[count];
        Arrays.setAll(array, i-> reference.get());
        return array;
    }
}
