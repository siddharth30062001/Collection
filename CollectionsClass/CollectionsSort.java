package CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionsSort {
    
    public static void main(String[] args) {
        
        ArrayList<String> s=new ArrayList<>();
        s.add("Vikas");
        s.add("Rahul");
        s.add("Rohan");
        s.add("Virat");

        Collections.sort(s);
        System.out.println("Sorted list of strings: ");
        Iterator<String> itr=s.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Sorting it in descending order: ");
        Collections.sort(s,Collections.reverseOrder());
        itr=s.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
