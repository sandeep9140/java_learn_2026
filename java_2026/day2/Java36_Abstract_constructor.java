abstract class Animal7 {

    String name;
    int age;

    // Abstract class constructor
    Animal7(String name, int age) {

        this.name = name;
        this.age = age;

        System.out.println("Animal7 Constructor");
    }

    // Abstract method
    abstract void sound();

    // Normal method
    void eat() {
        System.out.println(name + " is eating");
    }
}

class Dog7 extends Animal7 {

    String breed;

    // Dog constructor
    Dog7(String name, int age, String breed) {

        super(name, age);

        this.breed = breed;

        System.out.println("Dog7 Constructor");
    }

    // Implementing abstract method
    @Override
    void sound() {
        System.out.println(name + " is barking");
    }

    void display() {

        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Breed : " + breed);
    }
}

public class Java36_Abstract_constructor {

    public static void main(String[] args) {

        Dog7 d = new Dog7("Tommy", 3, "Labrador");

        System.out.println();

        d.display();

        d.sound();
        d.eat();
    }
}