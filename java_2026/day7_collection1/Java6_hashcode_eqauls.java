import java.util.HashSet;

class Student5{
    String name;
    Student5(String name){
        this.name=name;
    }
    @Override
    public boolean equals(Object obj) {

        Student5 s = (Student5) obj;

        return this.name.equals(s.name);
    }

}
public class Java6_hashcode_eqauls {

    public static void main(String[] args) {
        Student5 obj=new Student5("hello");
        Student5 obj2=new Student5("hello");
        System.out.println(obj.equals(obj2));
        System.out.println(obj.hashCode() == obj2.hashCode());
        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());


        System.out.println("hash code");
        

        
    }
    
}
