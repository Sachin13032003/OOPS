package OOPS;
/*
 * Synchrinization is the process by which we control the accessbility of multiple threads to a particular shared resource
 * here no data inconsistancy occur
 * no thread interface occur
 * Synchronization are two types process synchronization and Thread synchronization
 * Thread synchronization devided into two parts:- Mutual exclusive and cooperation
 */
public class Synchronizationn extends Thread{
   static Bookseats b;
    int bseat;
    public void run(){
        b.book(bseat);
    }
    public static void main(String[] args) {
        b =new Bookseats();
        Synchronizationn sachin = new Synchronizationn();
        sachin.bseat =7;
        sachin.start();
        Synchronizationn achin = new Synchronizationn();
        achin.bseat=6;
        achin.start();
}
}
class Bookseats{
    int tseat=10;
   /*  synchronized*/ void book(int bseat){// If we use synchronized keyword then at a time one object can use this resource
      synchronized(this){// this perform faster because it synchronizing the block only
        if(tseat>=bseat){
        System.out.println("seat booked sucessfully");
        tseat =tseat-bseat;
        System.out.println("Total seat remaining is "+tseat);
      }
      else{
        System.out.println("Seats can not be booked");
        System.out.println("Seats left "+tseat);
      }
    }
    }
  
}
