package Vector;

import java.util.*;

public class VectorAdd {
    
    public static void main(String[] args) {
        
        Vector<String> v=new Vector<>(4);
        v.add("Vipul");
        v.add("Sami");
        v.add("Rahul");
        v.add("Virat");
        System.out.println(v);
        System.out.println(v.size());
        System.out.println(v.capacity());
        v.addElement("Rohit");
        System.out.println(v);
        System.out.println(v.size());
        System.out.println(v.capacity());
    }
}
