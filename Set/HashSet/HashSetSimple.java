package Set.HashSet;

import java.util.HashSet;

public class HashSetSimple {
    
    public static void main(String[] args) {
        
        HashSet<String> set=new HashSet<>();
        set.add("Virat");
        set.add("Rohit");
        set.add("Dhoni");
        set.add("Rohit");
        System.out.println(set);
    }
}
