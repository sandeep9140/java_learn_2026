interface Test{
    void abstractMethod();

    default void defaultMethod(){
        System.out.println("default...");
    }
    static void staticMethod(){
        System.out.println("static...");
    }

    private void privateMethod(){
        System.out.println("private...");
    }

}


class TestImpl implements Test{
    public void abstractMethod(){
        System.out.println("abstratt.......");
    }
}


public class Java4_Interface_methods {
    public static void main(String[] args) {
        Test obj=new TestImpl();

        obj.abstractMethod();

        obj.defaultMethod();

        //obj.staticMethod();


    }
    
}
