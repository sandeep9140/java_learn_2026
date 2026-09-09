class MyThreads extends  Thread{
    @Override 
    public void run(){
        for(int i=1;i<5; i++){
            System.out.println("thread mera ----------------------");
        }
    }
}
public class Java2_ThreadType1 {
    public static void main(String[] args) {
        MyThreads t=new MyThreads();
        t.start();

        for(int i=1;i<5; i++){
            System.out.println("thread main ");
        }
    }

    
}