class A1{
	void sound(){
		System.out.println("animal males sound");
	}

}
class Dog1 extends A1{
	
	void sound(){
		super.sound();
		System.out.println("dog barks");
	}

}
public class Java11_inheritance_methodOverriding {
	public static void main(String[] args) {
		
	
Dog1 d=new Dog1();
d.sound();
	}
    
}
