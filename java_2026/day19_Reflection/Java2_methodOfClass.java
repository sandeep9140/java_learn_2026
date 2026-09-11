class Student8 {
}

public class Java2_methodOfClass {
    public static void main(String[] args) {

        // method 1

        Class clazz = Student8.class;
        System.out.println(clazz.getClass());

        //Method 2

        Student8 user=new Student8();
        Class clazz1=user.getClass();
        System.out.println(clazz1);

        //method3

        //Class clazz3=Class.forName("com.example.Student8");



    }

}
