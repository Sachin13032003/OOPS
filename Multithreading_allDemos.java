package OOPS;
// Naming Threads 
// Basics Threads
public class Multithreading_allDemos extends Thread{
    public void run(){
        System.out.println("Hello");
        System.out.println(Thread.currentThread().getName());// getting the name of the thread
        Thread.currentThread().setName("Sachin");// setting the name of the thread
         System.out.println(Thread.currentThread().getName());
        // System.out.println(10/0);
    }
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Multithreading_allDemos m =new Multithreading_allDemos();
        System.out.println(Thread.currentThread().isAlive());// Returns the Thread status
        m.start();
        m.isAlive();
        

    }
}
