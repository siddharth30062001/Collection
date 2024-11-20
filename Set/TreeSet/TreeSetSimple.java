package Set.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetSimple {
    
    public static void main(String[] args) {
        
        TreeSet<Integer> set=new TreeSet<>(Comparator.reverseOrder());
        set.add(10);
        set.add(18);
        set.add(7);
        set.add(15);
        set.add(16);
        set.add(30);
        set.add(25);
        set.add(40);
        set.add(60);

        System.out.println("Initial Set: "+set);
        System.out.println("Reverse Order: "+set.descendingSet());
        System.out.println("Head Set: "+set.headSet(30, true));
        System.out.println("Sub Set: "+set.subSet(18,false, 30,true));
    }
}
