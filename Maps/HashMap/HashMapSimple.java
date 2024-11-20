package Maps.HashMap;

import java.util.*;

public class HashMapSimple {
   
    public static void main(String[] args) {
        
        Map<Integer,String> m=new HashMap<>();

        m.put(1, "Alice");
        m.put(2,"Bob");
        m.put(3,"Charlie");

        System.out.println("Traversing through map: ");
        for (Map.Entry<Integer,String> map : m.entrySet()) {
            System.out.println(map.getKey()+":"+map.getValue());
        }
    }
}
