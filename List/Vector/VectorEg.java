package Vector;

import java.util.*;

public class VectorEg {
    
    public static void main(String[] args) {
        
        Vector<String> v=new Vector<>(2,5);
        v.add("Punith");
        v.add("Raj");
        v.add("Kumar");

        Enumeration<String> e=v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
        System.out.println(v.capacity());
    }
}
