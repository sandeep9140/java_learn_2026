import java.util.List;

public class Java3_map {
    public static void main(String[] args) {
        List<Integer> num=List.of(
            1,2,3,4
        );

        List<Integer> result=num.stream()
                                .map(n -> n*2)
                                .toList();
                                
        System.out.println(result);
    }
    
}
