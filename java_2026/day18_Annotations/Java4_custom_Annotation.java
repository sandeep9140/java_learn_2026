// @interface MyAnnotation{

// }

@interface MyAnnotation1{
    int age();
    String name();
}

//@MyAnnotation 

@MyAnnotation1(name="sandeep" ,age=25)
public class Java4_custom_Annotation {
    public static void main(String[] args) {
        System.out.println("annotation blank");
    }
    
}
