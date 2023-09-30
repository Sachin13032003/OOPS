package OOPS;
// Join method perform another task to execute then the current thread executes
public class Joins_Thread extends Thread {
    public  void run(){
        Test t1= new Test();
        try {
            t1.start();
            t1.join();
        System.out.println("Thread 1 completed");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Joins_Thread j= new Joins_Thread();
        j.start();
        j.join();
        Test t = new Test();
        t.start();
    }
    static class Test extends Thread{
        public void run(){
            System.out.println("Thread 2 completed");
        }
    }
}
