class Box2{
    public static <T extends  Number> void show(T value){
        System.out.println(value);
    }
}

public class Java3_upperBound {
    public static void main(String[] args) {
        Box2.show(10);
        Box2.show(10.5);
        Box2.show(1000L);
        //Box2.show("helllo");// not allow allow only number or parent of number 
        
    }
    
}
