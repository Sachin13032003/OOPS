package OOPS;
/*
 * Interrupte used to interrupte an excuting thread
 * for interrupting a state the thread must be in sleep mode or wait mode
 * Interrupted method is uded to check wheather a thread is interrupte or not 
 * Interrupted method change the resuult of interrupte
 */
public class Interrupte_Interrupted extends Thread{
    public  void run(){
        System.out.println(Thread.interrupted());
        System.out.println(Thread.currentThread().isInterrupted());
        try{
            Thread.sleep(1000);
        System.out.println("Thread 1 completed");
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        Interrupte_Interrupted i= new Interrupte_Interrupted();
        i.start();
        i.interrupt();
    }

}