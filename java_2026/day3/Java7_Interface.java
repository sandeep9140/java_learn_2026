interface A3{
    void pay();
}

class UPI implements A3{
    public void pay(){
        System.out.println("pay thorught UPI");
    }
}
public class Java7_Interface {
    public static void main(String[] args) {
        A3 a=new UPI();
        a.pay();
    }
}
