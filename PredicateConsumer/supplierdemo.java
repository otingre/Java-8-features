package PredicateConsumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class supplierdemo{

    public static void main(String[] args) {
        
        
        Supplier<String> supplier = () -> "Hi Omi";

        List<String> list1 = Arrays.asList("z");

        System.out.println(list1.stream().findAny().orElseGet(supplier));
    }
}