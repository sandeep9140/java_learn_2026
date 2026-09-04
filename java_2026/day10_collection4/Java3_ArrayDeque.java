import java.util.ArrayDeque;
import java.util.Deque;

public class Java3_ArrayDeque {
    public static void main(String[] args) {
        Deque<Integer> d=new ArrayDeque<>();
        d.addFirst(10);
        d.addFirst(5);
        d.offerFirst(20);
        d.addLast(30);
        d.addLast(40);
        d.offerLast(50);

        System.out.println(d);

        d.removeFirst();
        System.out.println(d);
        d.pollFirst();
        System.out.println(d);
        d.pollLast();
        System.out.println(d);
        System.out.println(d.peekFirst());
        System.out.println(d.peekLast());
    }
    
}
