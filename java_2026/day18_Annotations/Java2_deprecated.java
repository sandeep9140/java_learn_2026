class B{
    @Deprecated 
    public void oldShow(){
        System.out.println("old show");
    }

    public void newShow(){
        System.out.println("new show");
    }
}
public class Java2_deprecated {
    public static void main(String[] args) {
        B o=new B();
        o.newShow();

        o.oldShow();// it genarte warning
    }
    
}
