import java.util.Set;
import java.util.TreeSet;

public class java4TreeSet {
    public static void main(String[] args) {
        //unique + sorted
        TreeSet<Integer> t=new TreeSet<>();
        t.add(10);
        t.add(30);
        t.add(20);
        System.out.println(t);//sorted array   and work aall set mwthod i that there are some extra method


        System.out.println("extra method...............");
        System.out.println(t.first());//10
        System.out.println(t.last());//30

        System.out.println(t.floor(12));//small or eqal//10
        System.out.println(t.lower(20));//small strict//10

        System.out.println(t.ceiling(10));//greater or equal
        System.out.println(t.higher(20));//Strict big
    }
    
}
