package Set.TreeSet;

import java.util.TreeSet;

public class TreeSetImpl {
    
    public static void main(String[] args) {
        
        TreeSet<Integer> set=new TreeSet<>();

        set.add(24);    
        set.add(66);    
        set.add(12);    
        set.add(15);

        System.out.println("First element: "+set.pollFirst());
        System.out.println("First element: "+set.pollLast());
        System.out.println("Elements in the Set: "+set);
    }
}
