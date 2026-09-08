import java.util.List;

public class Java5_sorted {

    public static void main(String[] args) {
        List<Integer> num=List.of(10,30,10,3,40,34);

        List<Integer> result=num.stream()
                                .sorted()
                                .toList();

            System.out.println(result);
    }
    
}
