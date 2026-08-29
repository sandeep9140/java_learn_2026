interface A1{
    default void show(){
        System.out.println("A1");
    }
}

interface B1{
    default void show(){
        System.out.println("B1");
    }
}
class C1 implements A1,B1{
    public void show(){
        System.out.println("shoe called..");
    }
}
class Java2_multiple_inheritance_With_default{
    public static void main(String[] args) {
        C1 obj=new C1();
        obj.show();
    }

}