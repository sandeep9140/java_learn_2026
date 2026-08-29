interface Animal10 {

    // Abstract method
    void sound();

    // Default method
    default void eat() {
        System.out.println("Animal is eating");
    }

    // Static method
    static void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog10 implements Animal10 {

    // Implementing abstract method
    @Override
    public void sound() {
        System.out.println("Dog is barking");
    }

    // Overriding default method
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
}

public class Java39_Interface_method {

    public static void main(String[] args) {

        Dog10 d = new Dog10();

        // Abstract method
        d.sound();

        // Overridden default method
        d.eat();

        // Static interface method
        Animal10.sleep();
    }
}