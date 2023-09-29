package OOPS;
// we can perform multiple task using muliple threads we have to create different classes for that and object 
// Threads are executing at the same time
public class Multithreadings {
   static class Test1 extends Thread{
    public void run(){
        System.out.println("task1");
    }
   } 
   static class Test2 extends Thread{
    public void run(){
        System.out.println("task2");
    }
   }
   public static void main(String[] args) {
    Test1 t = new Test1();
    t.start();
    Test2 t1 =new Test2();
    t1.start();
   }
}
