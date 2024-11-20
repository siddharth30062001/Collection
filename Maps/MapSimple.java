package Maps;

import java.util.Map;
import java.util.HashMap;

public class MapSimple {
    
    public static void main(String[] args) {
        
        Map<String,Integer> map=new HashMap<>();

        map.put("Alice",22);
        map.put("Bob",25);
        map.put("Charlie", 34);

        System.out.println("Age of Bob: "+map.get("Bob"));

        System.out.println("Alice is present or absent? "+map.containsKey("Alice"));
        System.out.println("Age 25 is present or absent? "+map.containsValue(25));

        map.remove("Alice");

        System.out.println("Size: "+map.size());
    }
}
