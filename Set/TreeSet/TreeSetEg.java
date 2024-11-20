package Set.TreeSet;

import java.util.TreeSet;

public class TreeSetEg {
    
    public static void main(String[] args) {
        
        TreeSet<String> ts=new TreeSet<>();

        ts.add("A");
        ts.add("B");
        ts.add("C");
        ts.add("D");
        ts.add("E");

        System.out.println("Initial Set: "+ts);
        System.out.println("Reverse Order traversing: "+ts.descendingSet());

        System.out.println("HeadSet: "+ts.headSet("C"));
        System.out.println("Inclusive HeadSet: "+ts.headSet("C",true));
        System.out.println("TailSet: "+ts.tailSet("C"));
        System.out.println("Exclusive TailSet: "+ts.tailSet("C",false));
    }
}
