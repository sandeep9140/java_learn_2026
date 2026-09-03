import java.util.LinkedList;
import java.util.List;

public class Java6_linkedList_methods {
    public static void main(String[] args) {
        List<String> ll=new LinkedList<>();
        ll.add("sandeep");
        ll.add("vijay");
        ll.add("ankit");
        System.out.println(ll);
        System.out.println(ll.get(0));
        System.out.println(ll.set(1,"lalla"));

        System.out.println(ll.contains("sandeep"));
        System.out.println(ll.remove(1));
        System.out.println(ll);
        System.out.println(ll);
        System.out.println(ll);
        System.out.println(ll);
    }
}
