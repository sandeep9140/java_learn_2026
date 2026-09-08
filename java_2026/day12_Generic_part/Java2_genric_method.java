class Box1{
    public static <T> void show(T value){
        System.out.println(value);
    }
}
public class Java2_genric_method {
    public static void main(String[] args) {
        Box1.show("java");
        Box1.show(1000);
        Box1.show(10.5);
        
    }
    
}
