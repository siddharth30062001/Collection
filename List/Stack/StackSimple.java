package Stack;

import java.util.*;

public class StackSimple {
 
    public static void main(String[] args) {
        
        Stack<String> s=new Stack<String>();
        s.push("A");
        s.push("B");
        s.push("C");
        s.push("D");
        s.push("E");
        s.pop();
        Iterator<String> i=s.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
