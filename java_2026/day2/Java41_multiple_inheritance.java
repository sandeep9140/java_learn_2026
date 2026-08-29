interface Animal13 {

    void eat();
}

interface Pet13 {

    void play();
}

class Dog13 implements Animal13, Pet13 {

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void play() {
        System.out.println("Dog is playing");
    }
}

public class Java41_multiple_inheritance {

    public static void main(String[] args) {

        Dog13 d = new Dog13();

        d.eat();
        d.play();
    }
}