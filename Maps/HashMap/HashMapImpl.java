package Maps.HashMap;

import java.util.*;

public class HashMapImpl {
    
    public static void main(String[] args) {
        
        Map<Integer,String> map=new HashMap<>();

        map.put(101, "Alice");
        map.put(102, "Bob");
        map.put(103, "Charlie");

        System.out.println("Map Entries: "+map);

        map.putIfAbsent(102, "David");
        System.out.println("Map Entries: "+map);

        map.putIfAbsent(104, "David");
        System.out.println("Map Entries: "+map);  
        
        Map<Integer,String> map1=new HashMap<>();

        map1.put(105, "Eve");
        map1.put(106, "Forgueson");

        map.putAll(map1);

        System.out.println("Map Entries: "+map);
    }
}
