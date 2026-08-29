abstract class Animal6 {

    // Abstract method
    abstract void sound();

    // Normal method
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog6 extends Animal6 {

    // Implementing abstract method
    @Override
    void sound() {
        System.out.println("Dog is barking");
    }
}

public class Java35_Abstract_class {

    public static void main(String[] args) {

        // Animal a = new Animal(); // ❌ Cannot create object

        Dog6 d = new Dog6();

        d.sound();
        d.eat();
    }
}