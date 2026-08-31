// shalow cloning meaniing one change it effect another object 
// object --> cloning ---> copy object  (but refrence same )

class Student1 implements Cloneable{
    
    String name;
    Student1(String name){
        this.name=name;
    }
    

}
public class Java2_Deep_cloning {
    public static void main(String[] args) throws CloneNotSupportedException{
        Student1 s1=new Student1("aryan");//og
        Student1 s2 =s1;
        System.out.println(s1);
        
        System.out.println(s2);
        
    }
    
}
