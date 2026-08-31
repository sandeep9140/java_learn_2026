public class Java8_try_catch {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("caught exception");
        }
         catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("caught exception");
        }
    }
    
}
