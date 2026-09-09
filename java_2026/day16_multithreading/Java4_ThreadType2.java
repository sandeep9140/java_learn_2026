class Thread3 implements  Runnable{
    @Override 
    public void run(){
        System.out.println("runnable ----");
    }
}
public class Java4_ThreadType2 {
    public static void main(String[] args) {
        Thread3 t3=new Thread3();
        Thread t=new Thread(t3);

        t.start();
        System.out.println("main");
        
    }
    
}
