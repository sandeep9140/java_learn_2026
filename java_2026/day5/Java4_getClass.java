class A{

}
class B extends A{

}
public class Java4_getClass {
    public static void main(String[] args) {
        A obj=new B();
        System.out.println(obj.getClass());
    }
    
}
