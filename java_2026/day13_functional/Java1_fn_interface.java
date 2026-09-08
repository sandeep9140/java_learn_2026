@FunctionalInterface 
interface Cal{
    void  show();
    //void  show4();
    static void show2(){
        System.out.println("hello static");
    }
    default void show3(){
        System.out.println("hello static");
    }
}
public class Java1_fn_interface implements Cal {
    @Override 
        public void show(){
            System.out.println("halla bol");
        }

        // @Override 
        // public void show4(){
        //     System.out.println("halla bol");
        // }
    public static void main(String[] args) {
        
        Cal c=new Java1_fn_interface();
        c.show();
        Cal.show2();
        c.show3();
        //c.show4();
        
    }

    
}
