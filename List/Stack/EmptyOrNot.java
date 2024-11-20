package Stack;

import java.util.Stack;

public class EmptyOrNot {
    
    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack.empty());
        stack.add(24);
        stack.add(18);
        stack.add(12);
        System.out.println(stack);
        System.out.println(stack.empty());
    }
}
