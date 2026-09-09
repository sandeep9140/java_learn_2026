class Thread5 extends Thread{
    int a;
    Thread5(int a){
        this.a=a;
    }

    @Override 
    public void run(){
        for(int i=1;i<=a;i++){
            System.out.println("thead ="+a);
        }
    }
}
public class Java6_sleep_join {
    public static void main(String[] args) {
        Thread5 t=new Thread5(5);

        Thread5 t1=new Thread5(10);

        t.start();
        try{
            t.sleep(7000);
        }catch(Exception e){
            e.printStackTrace();
        }
        

        t1.start();

        try{
            //t1.sleep(7000);
        }catch(Exception e){
            e.printStackTrace();
        }

        

        
    }
    
}
