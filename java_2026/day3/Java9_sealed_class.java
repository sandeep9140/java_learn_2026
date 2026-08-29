sealed class Wife permits Hubby{
    void rista(){
        System.out.println("wife ");
    }
}

final class Hubby extends Wife{
    void meri(){
        System.out.println("pati hai mera hai meri");
    }

}
public class Java9_sealed_class {
    public static void main(String[] args) {
        Wife w=new Hubby();
        w.rista();
       // w.meri();
    }
    
}
