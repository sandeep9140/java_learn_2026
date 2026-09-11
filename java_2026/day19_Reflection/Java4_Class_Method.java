class Student10{
    public void study(){
        System.out.println("studying-------");
    }

    public void play(){
        System.out.println("playing------");
    }

}
public class Java4_Class_Method {
    public static void main(String[] args) {
        Class<?> clazz=Student10.class;
        System.out.println(clazz.getName());
        System.out.println("Methods..........");

        for(var methods : clazz.getDeclaredMethods()){
            System.out.println(methods.getName());
        }
    }
    
}
