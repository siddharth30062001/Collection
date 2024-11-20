package CollectionsClass;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsMinAndMax {
    
    public static void main(String[] args) {
        
        List<Integer> l=new ArrayList<>(Arrays.asList(5, 3, 8, 1, 2));

        System.out.println("Initial List: "+l);

        Collections.sort(l);
        System.out.println("Sorted List: "+l);

        Collections.reverse(l);
        System.out.println("Reversed List: "+l);

        Collections.shuffle(l);
        System.out.println("Shuffled List: "+l);

        System.out.println("Minimum Element: "+Collections.min(l));
        System.out.println("Maximum Element: "+Collections.max(l));

        List<Integer> syncList=Collections.synchronizedList(l);
        System.out.println("Synchronized List: "+syncList);
    }
}
