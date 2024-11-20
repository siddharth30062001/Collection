package ArrayList;

import java.util.*;

public class ListIteration {
    
    public static void main(String[] args) {
        
        ArrayList<String> l=new ArrayList<>();
        l.add("Shubam");
        l.add("Rahul");
        l.add("Rohan");
        l.add("Ashish");
        /*Iterator<String> i=l.iterator();
        while(i.hasNext()){                    //Iterting list using Iterator
            System.out.println(i.next());
        }*/
        //System.out.println(l);              //Direct Iteration
        System.out.println(l.get(1));
        System.out.println("---");
        l.set(1,"Vipul");
        for (String string : l) {
            System.out.println(string);             //Iterating via FOREACH loop
        }
        System.out.println("---");
        System.out.println("Sorting the elements");
        Collections.sort(l);
        System.out.println(l);
    }
}
