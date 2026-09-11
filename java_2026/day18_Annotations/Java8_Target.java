import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@interface MyAnnu{
}

@Target({
    ElementType.TYPE,
    ElementType.METHOD
})
@interface MyAnnu2{
}



//@MyAnnu // apply beacuse its made for class only 
@MyAnnu2 
class D{
    //@MyAnnu   // error becouse of type is class 
    @MyAnnu2 
    public void show(){
        System.out.println("he;;o");
    }

}
public class Java8_Target {
    public static void main(String[] args) {
        System.out.println("hello");
    }
    
}
