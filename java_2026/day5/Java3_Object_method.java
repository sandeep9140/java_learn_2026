class Student{
    int id;
    String name;

}


public class Java3_Object_method {
    public static void main(String[] args) {
        Student s=new Student();

        System.out.println(s.hashCode());
        Student n=new Student();

        System.out.println(s.equals(n));

        System.out.println(s);
        System.out.println(s.toString());


        
    }
    
}
