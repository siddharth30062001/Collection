package Queue.PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueCollections {
    
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());

        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(40);

        System.out.println("Intial Queue: "+pq);

        System.out.println("Head of the Queue: "+pq.peek());

        System.out.println("Removed: "+pq.poll());
        System.out.println("Removed: "+pq.poll());

        System.out.println("Final queue: "+pq);
    }
}
