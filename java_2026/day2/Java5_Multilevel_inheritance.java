class Animal{
    void eat(){
        System.out.println("eating,,,,,");
    }
}
 
class Mammal extends Animal{
    void walk(){
        System.out.println("walking........");
    }
}

public class Java5_Multilevel_inheritance extends Mammal {
    void bark(){
        System.out.println("barking");
    }

    public static void main(String[] args) {
        Java5_Multilevel_inheritance obj=new Java5_Multilevel_inheritance();

        obj.eat();
        obj.walk();
        obj.bark();
    }
    
}
