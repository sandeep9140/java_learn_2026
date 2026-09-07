import java.util.HashMap;

public class Map2_hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(101,"Sandeep");
        map.put(102,"Rahul");
        map.put(103,"amit");

        System.out.println(map);


        map.put(101, "Sandeep");

map.get(101);

map.remove(101);
System.out.println(map);

map.containsKey(101);

map.containsValue("Sandeep");
System.out.println(map);

map.size();

map.isEmpty();
System.out.println(map);

map.getOrDefault(105, "Unknown");

map.putIfAbsent(101, "Rahul");
System.out.println(map);

map.replace(101, "Sandeep Kumar");

map.keySet();

map.values();
System.out.println(map);

map.entrySet();

map.clear();
System.out.println(map);
        
    }
    
}
