abstract class Vehicle{
    abstract void start();

    void stop(){
        System.out.println("vehicle stoped");
    }
}


class Car extends Vehicle{
    void start(){
        System.out.println("car start using engine");
    }
}
public class Java6_ABstract_class {
    public static void main(String[] args) {
        Car c=new Car();
        c.start();
        c.stop();
    }
    
}
