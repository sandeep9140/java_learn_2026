import java.util.ArrayDeque;
import java.util.Deque;

public class Java4_deque_as_queue {
    public static void main(String[] args) {
        Deque<Integer> d=new ArrayDeque<>();

        d.offerLast(20);
        d.offerLast(15);
        d.offerLast(10);
        d.offerLast(5);
        System.out.println(d);
        System.out.println(d.peekFirst());
        
    }
    
}
