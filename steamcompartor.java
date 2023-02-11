import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class steamcompartor {
    public static void main(String[] args) {
        
        ArrayList <Integer> marks = new ArrayList<Integer>();
        marks.add(70);
        marks.add(30);
        marks.add(80);
        marks.add(65);
        marks.add(40);
        marks.add(10);
        marks.add(15);
        System.out.println(marks);
        List<Integer> sortedlist = marks.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
        System.out.println(sortedlist);
    }
}
