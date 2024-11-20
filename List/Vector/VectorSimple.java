package Vector;

import java.util.Iterator;
import java.util.Vector;

public class VectorSimple {
    
    public static void main(String[] args) {
        
        Vector<String> v=new Vector<>();
        v.add("Rahul");
        v.add("Rohan");
        v.add("Rahul");

        Iterator<String> i=v.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
