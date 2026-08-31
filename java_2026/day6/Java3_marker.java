interface Printable{
}
class Student2 implements Printable{
    void show(){
        System.out.println("Student is printable");
    }
}
public class Java3_marker {
    public static void main(String[] args) {
        Student2 s=new Student2();
        s.show();
    }
}
