import java.util.function.Supplier;

public class Java5_supplier {
    public static void main(String[] args) {
        
        Supplier<String> s=() -> "Hello Sandeep";

        System.out.println(s.get());
    }
    
}
