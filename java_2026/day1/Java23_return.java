public class Java23_return {
    
       public static  void greet(){

            System.out.println("start");
            return;
            //System.out.println("ENd");//unreachable

        }
    public static void main(String[] args) {
        greet();
    }

    
}
