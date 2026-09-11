import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
@interface MyAnnotation3{
    String name();

}

@MyAnnotation3(name="java")
class A5{

}
public class Java5_SOURCE {
    public static void main(String[] args) {
        System.out.println("hello java ");
    }
    
}
