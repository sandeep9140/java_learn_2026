import java.util.ArrayList;
import java.util.List;

class Student{
    String name;
    Student(String name){
        this.name=name;
    }
}
public class Java_Collection_basics {
    public static void main(String[] args) {

        System.out.println("via object ");
        Student s1=new Student("s1");
        Student s2=new Student("s2");
        Student s3=new Student("s3");


        System.out.println("array List \n");
        List<Student> students=new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        System.out.println(students);
        for(Student obj : students){
            System.out.println(obj.name);
        }
        
        
    }
    
}
