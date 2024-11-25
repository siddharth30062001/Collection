package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class ListSimple {
    
    public static void main(String[] args) {
        
        LinkedList<String> list = new LinkedList<String>();
        list.add("Ravi");
        list.add("Shubam");
        list.add("Rahul");
        list.add("Rohan");
        list.add("Ashish");
        Iterator<String> i=list.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        
        list.remove("Rohan");
        System.out.println("list after Removing");
        System.out.println(list);


    }
}
