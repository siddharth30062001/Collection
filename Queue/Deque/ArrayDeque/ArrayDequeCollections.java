package Queue.Deque.ArrayDeque;

import java.util.*;  

public class ArrayDequeCollections {
    
    public static void main(String[] args) {
        
        Deque<String> deque = new ArrayDeque<String>();  
        deque.offer("Ravi");    
        deque.offer("Vijay");     
        deque.offerFirst("Ajay"); 

        System.out.println("Elements: "+deque);

        deque.pollLast();

        System.out.println("Elements: "+deque);
    }
}
