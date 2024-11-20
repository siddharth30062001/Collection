package Set.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    
    public static void main(String[] args) {
        
        TreeSet<Integer> numbers=new TreeSet<>();
        
        numbers.add(50);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Elements int the TreeSet are: "+numbers);

        System.out.println("First element: "+numbers.first());
        System.out.println("Last element: "+numbers.last());

        System.out.println("SubSet(10,40): "+numbers.subSet(10, 40));

        System.out.println("Higher then 10: "+numbers.higher(10));
        System.out.println("Lower then 10: "+numbers.lower(10));

        System.out.println("Traversing the elements in descending order");
        Iterator<Integer> itr=numbers.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
