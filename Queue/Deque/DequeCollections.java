package Queue.Deque;

import java.util.Deque;
import java.util.LinkedList;

public class DequeCollections {

    public static void main(String[] args) {
        
        Deque<String> dq=new LinkedList<>();

        dq.addFirst("John");
        dq.addLast("Alice");
        dq.addFirst("Charlie");

        System.out.println("Elements: "+dq);

        System.out.println("First: "+dq.peekFirst());
        System.out.println("Last: "+dq.peekLast());

        System.out.println("Remove First: "+dq.removeFirst());
        System.out.println("Remove Last: "+dq.removeLast());

        System.out.println("Elements: "+dq);
    }
}
