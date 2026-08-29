class A{
	A(){
		System.out.println("A");
	}
}
class B extends A{
	B(){
		super();
		System.out.println("B");

	}
}
public class Java9_super_constructor {
	public static void main(String[] args){

B obj=new B();

}
    
}
