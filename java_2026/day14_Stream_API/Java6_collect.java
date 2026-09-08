import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Java6_collect {
    public static void main(String[] args) {
        List<Integer> num=List.of(10,302,33,2,1);

        List<Integer> result=num.stream()
                                .filter(n-> n>20)
                                .collect(Collectors.toList());

                                System.out.println(result);
    }
    
}
