class Animal{
    void eat(){
        System.out.println("animal is eating");
    }
}
public class Java1_Inheritance extends Animal {
    void bark(){
        System.out.println("dog barks");
    }
    public static void main(String[] args) {
        Java1_Inheritance obj=new Java1_Inheritance();
        obj.eat();
        obj.bark();
    }
    
}
