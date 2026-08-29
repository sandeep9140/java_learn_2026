public class Java8_Logical_Operators {
    public static void main(String[] args) {
        //  && || !
        boolean True=true;
        boolean False=false;

        System.out.println("&& operators");
        System.out.println(True && True); //true
        System.out.println(True && False);//false
        System.out.println(False && False);//false

        System.out.println("|| operators");
        System.out.println(True || True);// true
        System.out.println(True || False);//true
        System.out.println(False || False);//false

        System.out.println("! operators");
        System.out.println(!False);//true
        System.out.println(!True);//false
    }
    
}
