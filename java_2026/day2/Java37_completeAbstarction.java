interface Animal8 {

    void sound();

    void eat();

    void sleep();
}

class Dog8 implements Animal8 {

    @Override
    public void sound() {
        System.out.println("Dog is barking");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}

public class Java37_completeAbstarction {

    public static void main(String[] args) {

        Dog8 d = new Dog8();

        d.sound();
        d.eat();
        d.sleep();
    }
}