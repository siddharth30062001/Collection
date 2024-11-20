package ArrayList;

import java.util.*;

public class Iteration {
    
    public static void main(String[] args) {
        ArrayList<Integer> n=new ArrayList<>();
        n.add(45);
        n.add(18);
        n.add(99);
        n.add(100);
        n.add(33);
        n.add(34);
        System.out.println("Iterating directly");
        System.out.println(n);
        System.out.println("Using FOREACH loop");
        for (Integer integer : n) {
            System.out.println(integer);
        }
        System.out.println("Using Iterator");
        Iterator<Integer> i=n.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("Iterating using ListIterator");//Reverse order Traversing
        ListIterator<Integer> l=n.listIterator(n.size());
        while(l.hasPrevious()){
            int p=l.previous();
            System.out.println(p);
        }
        System.out.println("Traversing using for loop");
        for (int j = 0; j < n.size(); j++) {
            System.out.println(n.get(j));
        }
        System.out.println("Traversing using forEach()");
        n.forEach(a->{
            System.out.println(a);
        });
        System.out.println("Traversing using forEachRemaining()");
        Iterator<Integer> itr=n.iterator();
        itr.forEachRemaining(q->{
            System.out.println(q);
        });
    }    
}
