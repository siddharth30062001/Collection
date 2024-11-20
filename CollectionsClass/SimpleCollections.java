package CollectionsClass;

import java.util.*;

public class SimpleCollections {
    
    public static void main(String[] args) {
        
        List<String> list=new ArrayList<>();
        list.add("C");
        list.add("Core java");
        list.add("Advance java");
        System.out.println("Initial elements of list: "+list);
        Collections.addAll(list, "Spring","JSP");
        System.out.println("After adding elements to list: "+list);
        String[] str={".NET","C#"};
        Collections.addAll(list,str);
        System.out.println("After adding elementsfrom str[] to list: "+list);
    }
}
