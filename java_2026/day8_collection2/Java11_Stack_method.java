import java.util.Stack;

public class Java11_Stack_method {
     public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        
        System.out.println(stack);
        stack.push("sanju");
        stack.push("sanju1");
        stack.push("sanju2");
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack);
        System.out.println(stack.search("sanju1"));

    }

}
