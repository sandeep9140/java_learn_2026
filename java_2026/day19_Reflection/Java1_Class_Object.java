class Student7{
    public  void show(){
        System.err.println("hello students");
    }
}
class Java1_Class_Object{
    public static void main(String[] args) {
        // here we got only Student type of Object 
        Student7 obj1=new Student7();//Student7 

        // its return Class Type ok Object Which store metadata Of class Student 
        System.out.println(obj1.getClass());
        Class obj=Student7.class;

        System.out.println(obj.getName());
    }
}