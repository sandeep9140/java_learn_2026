import java.util.concurrent.ConcurrentHashMap;
public class ConcurrentHashMapDemo {


    



    public static void main(String[] args) {

        ConcurrentHashMap<Integer, String> map =
                new ConcurrentHashMap<>();

        map.put(101, "Sandeep");
        map.put(102, "Rahul");
        map.put(103, "Amit");

        System.out.println(map);
    }
}
    

