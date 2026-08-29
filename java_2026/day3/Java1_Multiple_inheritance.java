interface A{
    void show();//public abstact 
}

interface B{
    void show();//public abstact 
    void show2();
}

class C implements A,B{
    public void show(){
        System.out.println("show is running.......");
    }
    public void show2(){
        System.out.println("show2 is running.......");
    }
    
}

public class Java1_Multiple_inheritance {
    public static void main(String[] args) {
        C obj=new C();
        obj.show();
        obj.show2();
    }
    
}
