public class Java32_reference_varibale {
    int name=10;
    void show3(){
        System.out.println("hallla...");
    }
    public static void main(String[] args) {
        final Java32_reference_varibale obj=new Java32_reference_varibale();
        obj.show3();
        obj.name=30;
        System.out.println(obj.name);

       // s=new Java32_reference_varibale(); //error
    }
    
}
