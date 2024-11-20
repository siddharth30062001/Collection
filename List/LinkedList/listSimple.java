package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class listSimple {
    
    public static void main(String[] args) {
        
        LinkedList<String> l = new LinkedList<String>();
        l.add("Ravi");
        l.add("Shubam");
        l.add("Rahul");
        l.add("Rohan");
        l.add("Ashish");
        Iterator<String> i=l.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
