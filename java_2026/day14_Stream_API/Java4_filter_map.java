import java.util.List;

public class Java4_filter_map {
    public static void main(String[] args) {
        List<Integer> num=List.of(1,2,3,4,5);

        List<Integer> result=num.stream()
                                .filter(n -> n>3)
                                .map(n -> n*3 )
                                .toList();

        System.out.println(num);
        System.out.println(result);
    }
    
}
