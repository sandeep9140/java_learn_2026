import java.util.PriorityQueue;
import java.util.Queue;

public class Java6_prioeirty_queue {
    public static void main(String[] args) {
        Queue<Integer> pq=new PriorityQueue<>();
        pq.offer(1);
        pq.offer(5);
        pq.offer(20);
        pq.offer(10);
        pq.offer(19);
        pq.offer(7);
        System.out.println(pq);

        System.out.println(pq.peek());
        System.out.println("remove element = " +pq.poll());
        System.out.println(pq);

                System.out.println("remove element = " +pq.poll());
        System.out.println(pq);

                System.out.println("remove element = " +pq.poll());
        System.out.println(pq);

                System.out.println("remove element = " +pq.poll());
        System.out.println(pq);

                System.out.println("remove element = " +pq.poll());
        System.out.println(pq);

                System.out.println("remove element = " +pq.poll());
        System.out.println(pq);
        
                System.out.println("remove element = " +pq.poll());
        System.out.println(pq);
    }
    
}
