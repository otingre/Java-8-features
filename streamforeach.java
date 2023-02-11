import java.util.ArrayList;
import java.util.function.Consumer;

public class streamforeach {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        System.out.println(l);
        Consumer<Integer> c = i->{
            System.out.println("The Square root of " + i + " is " +(i*i));
        };
        l.stream().forEach(c);
    }

}
