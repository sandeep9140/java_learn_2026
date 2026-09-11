
class Student9 {
    public void show() {
        System.err.println("hello students");
    }
}

public class Java3_Imp_method {
    public static void main(String[] args) {
        Class obj = Student9.class;

        System.out.println(obj.getName());
        System.out.println(obj.getSimpleName());
        System.out.println(obj.getSuperclass());
        System.out.println(obj.getPackageName());
    }
}
