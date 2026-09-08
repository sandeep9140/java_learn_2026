
import java.util.function.Consumer;

public class Java6_method_refrence {

    public static void main(String[] args) {

        Consumer<String> c = System.out::println;

        c.accept("Hello Java");
        c.accept("Hello Sandeep");
    }
}
    

