package OOPS;
// For using wait method we need to use synchronize block and we have to declaire the notify and notifyall method also
// this method sent the thread to waiting state and let the thread complete 
public class InterThreadCommunication{

    public static void main(String[] args) throws Exception {
        InterThreadCommunication1 i =new InterThreadCommunication1();
        i.start();
        //System.out.println("Total seat booked is:- "+i.tseat);
        synchronized(i){
            i.wait();
            System.out.println("Total seat is:- "+i.tseat);
        }
    }
}
class InterThreadCommunication1 extends Thread{
    int tseat =0;
    public void run(){
        synchronized(this){
    for (int i = 0; i <=10; i++) {
        tseat=tseat+1;
    }
    this.notify();
}
}
}
