import java.util.LinkedHashMap;

public class Map2_linkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> map=new LinkedHashMap<>();
          map.put(103, "Amit");
        map.put(101, "Sandeep");
        map.put(102, "Rahul");

        System.out.println(map);
        map.put(101, "Sandeep");
map.get(101);
map.remove(101);

map.containsKey(101);
map.containsValue("Sandeep");

map.size();
map.isEmpty();

map.getOrDefault(105, "Unknown");
map.putIfAbsent(105, "Raj");

map.replace(101, "Sandeep Kumar");

map.keySet();
map.values();
map.entrySet();

map.clear();
    }
    
}
