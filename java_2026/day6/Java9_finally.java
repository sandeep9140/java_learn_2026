public class Java9_finally {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("caught exception");
        }
        finally{
            System.out.println("always executed");
        }
    }
    
    
}
