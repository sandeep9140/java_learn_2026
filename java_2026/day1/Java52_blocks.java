public class Java52_blocks {
    static{
        System.out.println("static");
    }
    {
        System.out.println("instance block");
    }
    Java52_blocks(){
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        System.out.println("main");
        new Java52_blocks();
        System.out.println("second  object acllles");
        new Java52_blocks();

    }
    
}
