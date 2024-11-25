package ArrayList;

import java.util.*;

public class Iteration {
    
    public static void main(String[] args) {
        ArrayList<Integer> number=new ArrayList<>();
        number.add(45);
        number.add(18);
        number.add(99);
        number.add(100);
        number.add(33);
        number.add(34);
        System.out.println("Iterating directly");
        System.out.println(number);
        System.out.println("Using FOREACH loop");
        for (Integer integer : number) {
            System.out.println(integer);
        }
        System.out.println("Using Iterator");
        Iterator<Integer> i=number.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("Iterating using ListIterator");//Reverse order Traversing
        ListIterator<Integer> l=number.listIterator(number.size());
        while(l.hasPrevious()){
            int p=l.previous();
            System.out.println(p);
        }
        System.out.println("Traversing using for loop");
        for (int j = 0; j < number.size(); j++) {
            System.out.println(number.get(j));
        }
        System.out.println("Traversing using forEach()");
        number.forEach(a->{
            System.out.println(a);
        });
        System.out.println("Traversing using forEachRemaining()");
        Iterator<Integer> itr=number.iterator();
        itr.forEachRemaining(q->{
            System.out.println(q);
        });
    }    
}
