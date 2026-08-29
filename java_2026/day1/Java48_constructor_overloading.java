public class Java48_constructor_overloading {


    String name;
    int age;

    Java48_constructor_overloading() {
        System.out.println("No argument constructor");
    }

    Java48_constructor_overloading(String name) {
        this.name = name;
        System.out.println("run 1");
    }

    Java48_constructor_overloading(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("run 2");
    }

    public static void main(String[] args) {
        new Java48_constructor_overloading();
        new Java48_constructor_overloading("sandeep");
        new Java48_constructor_overloading("sandeep",22);
    }
}
    

