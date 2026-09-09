public class Java3_modern_runnable {
    public static void main(String[] args) {
        Runnable t4=()->{
            System.out.println("runnable thread--------");
        };

        Thread t=new Thread(t4);
        t.start();
    }
    
}
