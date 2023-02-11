import java.util.ArrayList;

public class streamcount {
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
        long nooffialedstds = marks.stream().filter(m->m<30).count();
        System.out.println(nooffialedstds);
    }
}
