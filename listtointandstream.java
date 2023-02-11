import java.util.ArrayList;
import java.util.stream.Stream;

public class listtointandstream {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        Integer[] i = l.stream().toArray(Integer[]::new);
        // for (Integer i1:i){
        //     System.out.println(i1);
        // }
        Stream.of(i).forEach(System.out::println);
    }

}
