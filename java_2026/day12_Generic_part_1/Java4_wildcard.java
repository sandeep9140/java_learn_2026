import java.util.List;

class Lists{
    public  static  void show(List<?> list){
        
        for(Object items : list){
            System.out.println(items);
        }
    }
}
public class Java4_wildcard {
    public static void main(String[] args) {
        List<String> names=List.of("A","B","c");
        List<Integer> numbers=List.of(10,20,30);

        Lists.show(names);
        Lists.show(numbers);
        
    }
    
}
