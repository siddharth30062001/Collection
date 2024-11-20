package Queue;

import java.util.Queue;
import java.util.LinkedList;

public class QueueCollections {
    
    public static void main(String[] args) {
        
        Queue<String> queue=new LinkedList<>();

        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");
        queue.add("David");

        System.out.println("Initial Queue: "+queue);

        System.out.println("Head of the Queue: "+queue.peek());

        System.out.println("Removed: "+queue.poll());
        System.out.println("Removed: "+queue.poll());

        System.out.println("Final queue: "+queue);
    }
}
