public class Java5_collable {
    public static void main(String[] args) {
        Callable<Integer> c=() -> {
            return 100+200;
        };

        c.start();
    }
    
}
