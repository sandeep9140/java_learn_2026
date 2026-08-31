// shalow cloning meaniing one change it effect another object 
// object --> cloning ---> copy object  (but refrence same )

class Student implements Cloneable{
    
    String name;
    Student(String name){
        this.name=name;
    }
    @Override
    public Student clone() throws CloneNotSupportedException{
        return (Student)super.clone();

    }

}
public class Java1_Shalow_cloning {
    public static void main(String[] args) throws CloneNotSupportedException{
        Student s1=new Student("aryan");//og
        Student s2 = (Student) s1.clone();
        System.out.println(s1);
        System.out.println(s2);
        
    }
    
}
