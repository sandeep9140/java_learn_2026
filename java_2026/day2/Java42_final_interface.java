interface Animal14 {

    // Interface variable is automatically:
    // public static final
    int AGE = 5;
    String NAME = "Tommy";

    void sound();
}

class Dog14 implements Animal14 {

    @Override
    public void sound() {
        System.out.println("Dog is barking");
    }

    void display() {

        System.out.println("Name : " + NAME);
        System.out.println("Age  : " + AGE);
    }
}

public class Java42_final_interface {

    public static void main(String[] args) {

        Dog14 d = new Dog14();

        d.sound();
        d.display();

        // AGE = 10;          // ❌ Error
        // Animal14.AGE = 10; // ❌ Error
    }
}