import java.util.HashSet;
import java.util.Set;

public class Java1_set {
    public static void main(String[] args) {
        // not duplicate + order not guarranted
        Set<Integer> num = new HashSet<>();
        num.add(10);
        num.add(20);
        num.add(30);
        System.out.println(num);
        /*
         * all collection method add, set
         * set.add("A"); // element add
         * set.remove("A"); // element remove
         * set.contains("A"); // present hai? true/false
         * set.size(); // total elements
         * set.isEmpty(); // empty hai?
         * set.clear(); // saare elements remove
         */
    }

}
