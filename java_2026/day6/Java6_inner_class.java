class Outer{
    int number=10;
     class Inner{
        void show(){
            System.out.println(number);
        }
     }
}

public class Java6_inner_class {
    public static void main(String[] args) {
        Outer out=new Outer();

        Outer.Inner in=out.new Inner();

        in.show();
    }
    
}
