class MyThread extends  Thread{
    @Override 
    public void run(){
        System.out.println("thread -->  1");
    }
}
public class Java1_Thread {
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.start();

        System.out.println("main thread");
    }
    
}
