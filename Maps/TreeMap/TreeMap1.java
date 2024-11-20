package Maps.TreeMap;

import java.util.TreeMap;

public class TreeMap1 {
    
    public static void main(String[] args) {
        
        TreeMap<Integer,String> tm=new TreeMap<>();
        tm.put(101, "Alice");
        tm.put(102, "Bob");
        tm.put(103, "Charlie");
        tm.put(104, "David");

        System.out.println(tm);
    }
}
