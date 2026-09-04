import java.util.Deque;
import java.util.LinkedList;


public class Java2_deque {
    public static void main(String[] args) {
        Deque<Integer> d=new LinkedList<>();
        d.addFirst(10);
        System.out.println(d);
        d.offerFirst(20);
        System.out.println(d);

        d.addLast(30);
        System.out.println(d);
        d.addLast(40);
        System.out.println(d);
        System.out.println(d);

        d.getFirst();
        d.peekFirst();
        System.out.println(d);

        d.getLast();
        d.peekLast();
        System.out.println(d);

        d.removeFirst();
        System.out.println(d);
        d.pollFirst();
        System.out.println(d);
        d.removeLast();
        System.out.println(d);
        d.pollLast();
        System.out.println(d);
        System.out.println(d);

    }
}
