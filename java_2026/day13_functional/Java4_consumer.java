import java.util.function.Consumer;

public class Java4_consumer {
    public static void main(String[] args) {
        
        Consumer<String> c=name -> {
            System.out.println("Hello "+ name);
        };

        c.accept("sandeep");
    }
    
}
