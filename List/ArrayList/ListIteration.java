package ArrayList;

import java.util.*;

public class ListIteration {
    
    public static void main(String[] args) {
        
        ArrayList<String> list=new ArrayList<>();
        list.add("Shubam");
        list.add("Rahul");
        list.add("Rohan");
        list.add("Ashish");
        /*Iterator<String> i=l.iterator();
        while(i.hasNext()){                    //Iterting list using Iterator
            System.out.println(i.next());
        }*/
        //System.out.println(l);              //Direct Iteration
        System.out.println(list.get(1));
        System.out.println("---");
        list.set(1,"Vipul");
        for (String string : list) {
            System.out.println(string);             //Iterating via FOREACH loop
        }
        System.out.println("---");
        System.out.println("Sorting the elements");
        Collections.sort(list);
        System.out.println(list);
    }
}
