public class Java55_this_keyword {

    Java55_this_keyword(){
        this(22);
        System.out.println("no arg contructor");
    }

    Java55_this_keyword(int age){
        System.out.println("age "+ age );
    }
    public static void main(String[] args) {
        new Java55_this_keyword();
    }
    
}
