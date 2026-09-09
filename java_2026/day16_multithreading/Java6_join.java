class Thread7 extends Thread{
    @Override 
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("thread-parent= "+i);
        }
    }
}
public class Java6_join {
    public static void main(String[] args) {
        Thread7 t=new Thread7();
        
        t.start();
        try {
            t.join();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        
        


        for(int i=1;i<=20;i++){
            System.out.println("main thread = "+i);
        }
        
        
    }
    
}
