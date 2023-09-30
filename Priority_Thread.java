package OOPS;
// Jvm aloocates the prority of the thread and according to that jvm allocates the processor for threads
// priority sets using integer number between 1-10
// there are some default priority :
// MIN_PRIORITY(1) , MAX_PRIORITY(10) , NORM_PRIORITY(5) 
// PRIORITY depends on the platform(Windows does not support priority)
public class Priority_Thread extends Thread{
    public void run(){
        System.out.println("1");
        for (int i = 0; i <5; i++) {
            try {
                System.out.println(i);
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
    static class Test extends Thread{
        public void run(){
            System.out.println("2");
        }
    }
    public static void main(String[] args){ //throws Exception{
        // Priority_Thread p =new Priority_Thread();
        // p.setPriority(MIN_PRIORITY);
        // p.start();
        // Test t= new Test();
        // t.setPriority(MAX_PRIORITY);
        // t.start();
       // for (int i = 0; i < 5; i++) {
           // Thread.sleep(1000);// sleep method stop the program for some time
           // System.out.println(i);
       // }
       Priority_Thread p = new Priority_Thread();
       p.start();// sleep is a static method
    }
}
