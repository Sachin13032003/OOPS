package OOPS;
// Those Thread which runs in the background of another thread is known as daemon Thread
// it provides services for other threads
// E.g :- Garbage collector,signal dispatches,finalizer
// We have to create daemon thread before creating the parent thread
// We can't create a daemon thread of main thread
// it's life depend on the parent thread
public class DaemonThread extends Thread {
public void run(){
    System.out.println("Hello");
}
 public static void main(String[] args) {
    System.out.println("Hi");// if we are not perform any task in the parent thread then daemon thread not work
    DaemonThread d= new DaemonThread();
    d.setDaemon(true);// Creating the daemon thread
    d.start();
    Thread.currentThread().setDaemon(true);// throws exception
 }   
}
