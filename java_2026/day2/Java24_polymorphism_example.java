class Animal3{
    void sound(){
        System.out.println("ANimal sound");
    }
}

class Dog3 extends Animal3{
    void sound(){
        System.out.println("dog bark");
    }
}

class Cat3 extends Animal3{
    void sound(){
        System.out.println("cat barks");
    }
}
public class Java24_polymorphism_example {
    public static void main(String[] args) {
        Animal3 a;
         a= new Dog3();

         a.sound();

         a=new Cat3();
         a.sound();
    }
}
