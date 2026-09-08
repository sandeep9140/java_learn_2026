import java.util.List;

public class Java2_filter {
    public static void main(String[] args) {
        List<String> names = List.of(
                "Sandeep",
                "Rahul",
                "Amit",
                "Rohit",
                "Raj"
            );

        List<String> result=names.stream()
                            .filter(name -> name.length() >5)
                            .toList();

        System.out.println(result);
    }
}
