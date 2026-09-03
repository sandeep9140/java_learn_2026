import java.util.Stack;
import java.util.List;

class Java10_stack{
    public static void main(String[] args) {
        List<String> stack=new Stack<>();
        stack.add("sandeep");
        stack.add("vijay");
        System.out.println(stack);
        //stack.push("sanju");
        System.out.println(stack);
        // not work beacuse Stack not have the part of list 

    }
}