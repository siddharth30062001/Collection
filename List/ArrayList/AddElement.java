package ArrayList;

import java.util.*;
public class AddElement {
    
    public static void main(String[] args) {
        
        ArrayList<String> list=new ArrayList<>();
        list.add("Add");
        list.add("Element");
        list.add("in");
        System.out.println(list);

        ArrayList<String> list2=new ArrayList<>();
        list2.add("Array");
        list2.add("List");
        list2.addAll(list);
        System.out.println(list);

        ArrayList<String> list3=new ArrayList<>();
        list3.add("using");
        list3.add("addAll()");
        list.addAll(2,list3);
        System.out.println(list);
    }
}
