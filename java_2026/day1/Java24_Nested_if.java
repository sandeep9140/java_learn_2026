public class Java24_Nested_if {
    public static void main(String[] args) {
        int age=23;

        if(age>=18){
            System.out.print("u can visit and ");
            if(age>=21){
                System.out.println(" access");
            }
            else{
                System.out.println(" can't access");
            }

        }

        else{
            System.out.println("not Visit");
        }
    }
    
}
