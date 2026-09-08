interface A {
    void show();
}

public class Java2_Lambda {
    public static void main(String[] args) {

        A obj = () -> {
            System.out.println("hello");
        };
        obj.show();
    }
    

}