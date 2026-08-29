interface Animal9 {

    // Abstract methods
    void sound();

    void eat();
}

class Dog9 implements Animal9 {

    @Override
    public void sound() {
        System.out.println("Dog is barking");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
}

public class Java38_interface {

    public static void main(String[] args) {

        Dog9 d = new Dog9();

        d.sound();
        d.eat();
    }
}