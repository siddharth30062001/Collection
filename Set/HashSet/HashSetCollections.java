package Set.HashSet;

import java.util.*;

public class HashSetCollections {
    
    public static void main(String[] args) {
        
        HashSet<String> set=new HashSet<>();
        set.add("One");
        set.add("Two");
        set.add(null);
        set.add("Four");
        set.add("Four");
        set.add(null);
        set.add("Five");
        System.out.println("HashSet elements are: "+set);
        System.out.println("-----");
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
