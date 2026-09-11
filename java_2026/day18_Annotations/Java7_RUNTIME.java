import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation6 {
    String value();
}

@MyAnnotation6("Java")
class Student6 {
}

public class Java7_RUNTIME {
    public static void main(String[] args) {

        MyAnnotation6 annotation =
                Student6.class.getAnnotation(MyAnnotation6.class);

        System.out.println(annotation.value());
    }
}