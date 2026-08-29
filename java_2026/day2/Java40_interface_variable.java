interface Animal12 {

    // Interface variables
    int AGE = 5;
    String NAME = "Tommy";
    String COLOR = "Brown";
}

class Dog12 implements Animal12 {

    void display() {

        System.out.println("Name  : " + NAME);
        System.out.println("Age   : " + AGE);
        System.out.println("Color : " + COLOR);
    }
}

public class Java40_interface_variable {

    public static void main(String[] args) {

        Dog12 d = new Dog12();

        d.display();

        // Access using interface name
        System.out.println(Animal12.NAME);
        System.out.println(Animal12.AGE);
    }
}
