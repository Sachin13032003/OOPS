package OOPS;
/*
 Thread can be implemented by 2 ways: by using Thread class and by using Runnable interface
 */
public class Threads extends Thread{
    public void run(){
        System.out.println("hello");
    }
    public static void main(String[] args) {
        Threads t = new Threads();// Creating the Thread
        t.start();// we call the thread by using start method 
        //by using Thread class
        Test th = new Test();
        Thread t1 =new Thread(th);
        t1.start();
        // by using Runnable interface
    }
    static class Test implements Runnable{
        public void run(){
            System.out.println("hi");
        }
    }
}
