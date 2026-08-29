class A{
    String name="Animal";

}
public class Java8_super_keyword  extends A{
    String name="Dog";
    void display(){
        System.out.println(name);
        System.out.println(super.name);
    }

    public static void main(String[] args) {
        Java8_super_keyword obj=new Java8_super_keyword();
        obj.display();
    }
    
}
