package Multithreading;

public class ThreadTester {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("main is start");
        Thread thread1 = new Thread1();
        
        
        Thread2 thread2 = new Thread2();
        Thread t = new Thread(thread2);
        t.start();

        thread1.start();
        thread1.join();
        System.out.println("main is end");
    }
}
