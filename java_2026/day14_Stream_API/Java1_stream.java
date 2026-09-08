import java.util.List;

/**
 * Java1_stream
 */
public class Java1_stream {

    public static void main(String[] args) {
        List<String> names=List.of(
            "sandeep",
            "rahul",
            "amit",
            "rohit"
        );

        names.stream()
            .forEach(name -> System.out.println(name));
    }
}