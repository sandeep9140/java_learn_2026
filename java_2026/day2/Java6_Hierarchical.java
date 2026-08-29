class Animal{
    void eat(){
        System.out.println("eating.");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("barking.");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("meowing.");
    }
}
public class Java6_Hierarchical {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.eat();
        d.bark();

        System.out.println();
        Cat c=new Cat();
        c.eat();
        c.meow();
    }

    
}
