import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention (RetentionPolicy.CLASS)
@interface MyAnnotation4{
    String value();
}
@MyAnnotation4("java")
class Student{

}
public class Java6_Class {
    public static void main(String[] args) {
        System.out.println("hello java ");
        Class obj=Student.class;
        System.out.println(obj.getClass());
        System.out.println(obj.getSimpleName());
    }
    
}
