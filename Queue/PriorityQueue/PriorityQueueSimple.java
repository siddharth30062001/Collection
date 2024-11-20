package Queue.PriorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueSimple {
    
    public static void main(String[] args) {
        
        PriorityQueue<String> pq=new PriorityQueue<>();

        pq.add("Amit");  
        pq.add("Vijay");  
        pq.add("Karan");  
        pq.add("Jai");  
        pq.add("Rahul"); 

        System.out.println("Initial Queue: "+pq);

        System.out.println("Head: "+pq.element());
        System.out.println("Head: "+pq.peek());

        System.out.println("Remove: "+pq.remove());
        System.out.println("Queue contains: "+pq);

        System.out.println("Remove: "+pq.poll());
        System.out.println("Queue contains: "+pq);
    }
}
