import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Employee{
    private int id;
    private String name;
    public void word(){
    }

    public  void display(){
    }
}

public class Java5_field_Method {
    public static void main(String[] args) {
        Class clazz=Employee.class;
        System.out.println(clazz.getName());

        System.out.println("\nfields------");
        for(Field field : clazz.getDeclaredFields()){
            System.out.println(field.getName());
        }

        System.out.println("\nmethods:-----------------");
        for(Method method : clazz.getDeclaredMethods()){
            System.out.println(method.getName());
        }
    }
    
}
