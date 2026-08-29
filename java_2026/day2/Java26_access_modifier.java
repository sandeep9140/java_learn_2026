class Parent{
    private int a=10;
    int b=20;
    protected int c=30;
    public int d=40;

    void show1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

class Child extends Parent{
    void show2(){
        //System.out.println(a);// private
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
public class Java26_access_modifier {
    public static void main(String[] args) {
        Parent p=new Parent();

        
        //System.out.println(p.a); // private
        System.out.println(p.b);
        System.out.println(p.c);
        System.out.println(p.d);

        Child ch=new Child();
        ch.show1();

    }
    

}
