package Maps.TreeMap;

import java.util.TreeMap;

public class TreeMap2 {
    
    public static void main(String[] args) {
        
        TreeMap<Integer,String> tm=new TreeMap<>();

        tm.put(100,"Amit");    
        tm.put(102,"Ravi");    
        tm.put(101,"Vijay");    
        tm.put(103,"Rahul"); 

        System.out.println("Reverse Traversing: "+tm.descendingMap());

        System.out.println("Head Map: "+tm.headMap(102,true));

        System.out.println("Tail Map: "+tm.tailMap(102,true));

        System.out.println("Sub-Map: "+tm.subMap(101,true,103,true));
    }
}
