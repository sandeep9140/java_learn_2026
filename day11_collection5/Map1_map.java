import java.util.HashMap;
import java.util.Map;

class Map1_map{
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();

        map.put(101,"sandeep");
        map.put(102,"rahul");
        map.put(103,"amint");

        System.out.println(map);

        System.out.println(map.get(101));

        map.remove(103);

        System.out.println(map.containsKey(101));


        System.out.println(map.containsValue("rahil"));

           // 6. size()
        System.out.println("Size: " + map.size());


        // 7. isEmpty()
        System.out.println("Is Empty: " + map.isEmpty());


        // 8. getOrDefault()
        System.out.println("getOrDefault(105): "
                + map.getOrDefault(105, "Unknown"));


        // 9. putIfAbsent()
        map.putIfAbsent(104, "Raj");
        System.out.println("After putIfAbsent: " + map);


        // 10. replace()
        map.replace(104, "Rohit");
        System.out.println("After replace: " + map);


    }
}