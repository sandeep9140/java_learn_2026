class A2{
    A2(){
        System.out.println("A2()");
    }
}
class A3 extends A2{
    A3(){
        super();
        System.out.println("A3()");
    }
}

public class Java16_constructor_chaining {
    public static void main(String[] args) {
        A3 obj=new A3();
    }
    
}
