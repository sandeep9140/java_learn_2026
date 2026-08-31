public class Java10_throw {
    public static void main(String[] args) {
        int age=15;
        if(age<18){
            throw new ArithmeticException(
                "Age must 18+"
            );

        }
        System.out.println("eligible");
    }
    
}


