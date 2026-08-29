class Animal{
    void eat(){
        System.out.println("eating");
    }
}


public class Java4_Single_inheritance extends Animal {
    void bark(){
        System.out.println("barking");
    }
    public static void main(String[] args) {
        Java4_Single_inheritance obj=new Java4_Single_inheritance();
        obj.bark();
        obj.eat();
    }
    
}
