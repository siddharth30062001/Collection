package Maps.HashMap;


import java.util.*;
import java.util.Map.Entry;

public class Product {
public static void main(String[] args) {
Map<Integer,String> indmap = new HashMap<Integer, String>();
indmap.put(7, "Dohni");
indmap.put(8, "Virat");
indmap.put(10, "Rohit");

System.out.println("Iterating Map using entrySet()");
Set<Entry<Integer,String>> set=indmap.entrySet();
for(Entry<Integer,String> entry:set) {
Integer key=entry.getKey();
String val=entry.getValue();
System.out.println(key+" = "+" "+val);
}
}
}

