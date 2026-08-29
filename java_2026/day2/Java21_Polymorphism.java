class Payement{
    void pay(){
        System.out.println("Gen pay");
    }
}
class CreditCard extends Payement{
    void pay(){
        System.out.println("pay through card");
    }
}

class Upi extends Payement{
    void pay(){
        System.out.println("pay through UPI");
    }
}
public class Java21_Polymorphism {
    public static void main(String[] args) {
        Payement p1=new CreditCard();
        Payement p2=new Upi();

        p1.pay();
        p2.pay();
    }
    
}
