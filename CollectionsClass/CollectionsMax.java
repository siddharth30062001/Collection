package CollectionsClass;

import java.util.*;

public class CollectionsMax {
    
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(28);
        list.add(69);
        list.add(45);

        System.out.println("Maximum value in the list is: "+Collections.max(list));
        System.out.println("Minimum value in the list is: "+Collections.min(list));
    }

}
