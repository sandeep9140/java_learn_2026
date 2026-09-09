



    class Shared {

    synchronized void waitMethod() {

        try {
            System.out.println("Thread 1: Waiting...");
            wait();

            System.out.println("Thread 1: Wapas aa gaya");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void notifyMethod() {

        System.out.println("Thread 2: Notification de raha hoon");
        notify();
    }
}

public class Java8_WaitNotify {

    public static void main(String[] args) {

        Shared obj = new Shared();

        Thread t1 = new Thread(() -> {
            obj.waitMethod();
        });

        Thread t2 = new Thread(() -> {

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            obj.notifyMethod();
        });

        t1.start();
        t2.start();
    }
}
    

