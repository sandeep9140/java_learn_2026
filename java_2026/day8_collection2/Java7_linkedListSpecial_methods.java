import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Java7_linkedListSpecial_methods {
    public static void main(String[] args) {
        List<String> ll=new LinkedList<>();
        ll.add("sandeep");
        ll.add("sandeep2");
        ll.add("sandeep3");
        ll.add("sandeep4");
        ll.add("sandeep5");
        System.out.println(ll);

        System.out.println("Sepcial methods.....................");
        ll.addFirst("vijay");
        System.out.println(ll);

        ll.addLast("guddu");
        System.out.println(ll); 
        
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());


        
        System.out.println(ll.removeFirst());
        System.out.println(ll);
        System.out.println(ll.removeLast());
        System.out.println(ll);
        System.out.println("some method are unique==================");

        Queue<String> q=new LinkedList<>();
        System.out.println(q);
        q.offer("java");
        q.offer("java1");
        q.offer("java2");
        System.out.println(q);

        System.out.println(q.peek());
        System.out.println(q.element());
        System.out.println(q.poll());
        System.out.println(q.remove());
        System.out.println(q);
    }
    
}
