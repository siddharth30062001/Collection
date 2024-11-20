package ArrayList;

import java.util.*;
public class AddEle {
    
    public static void main(String[] args) {
        
        ArrayList<String> al=new ArrayList<>();
        al.add("Add");
        al.add("Element");
        al.add("in");
        System.out.println(al);
        ArrayList<String> al2=new ArrayList<>();
        al2.add("Array");
        al2.add("List");
        al.addAll(al2);
        System.out.println(al);
        ArrayList<String> al3=new ArrayList<>();
        al3.add("using");
        al3.add("addAll()");
        al.addAll(2,al3);
        System.out.println(al);
    }
}
