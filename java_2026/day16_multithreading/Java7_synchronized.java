class Thread8{
    public void show(String name){
        for(int i=1;i<10;i++){
        System.out.println(name);
        }
    }
}

public class Java7_synchronized {
    public static void main(String[] args) {
        Thread8 obj=new Thread8();

        Thread t1=new Thread(
            ()->
            obj.show("first")
        );
        

        Thread t2=new Thread(
            ()->
            obj.show("second")
        );
        t1.start();
        t2.start();
        
        
    }
    
}
