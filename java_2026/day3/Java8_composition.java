class Engine4 {

    void start() {
        System.out.println("Engine started");
    }
}

class Car4 {

    private Engine4 engine;

    Car4() {
        engine = new Engine4();
    }

    void startCar() {
        engine.start();
        System.out.println("Car started");
    }
}
public class Java8_composition {
    public static void main(String[] args) {
        Car4 car=new Car4();
        car.startCar();
    }
    
}
