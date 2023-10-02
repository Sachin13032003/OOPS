package OOPS;
/*
 * Synchrinization is the process by which we control the accessbility of multiple threads to a particular shared resource
 * here no data inconsistancy occur
 * no thread interface occur
 * Synchronization are two types process synchronization and Thread synchronization
 * Thread synchronization devided into two parts:- Mutual exclusive and cooperation
 * static synchronize synchronize the class 
 */
public class Synchronizationn extends Thread{
   static Bookseats b;
    int bseat;
    public void run(){
        b.book(bseat);
    }
    public static void main(String[] args) {
          Bookseats b1 = new Bookseats();
        //b =new Bookseats();
//         Synchronizationn sachin = new Synchronizationn();
//         sachin.bseat =7;
//         sachin.start();
//         Synchronizationn achin = new Synchronizationn();
//         achin.bseat=6;
//         achin.start();
           Mythread1 m =new Mythread1(b1,9);
           m.start();
           Bookseats b2 = new Bookseats();
           Mythread2 m1 = new Mythread2(b2,6);
           m1.start();
           Bookseats b3 = new Bookseats();
           Mythread3 m2 = new Mythread3(b3,7);
           m2.start();

 }
}
class Bookseats{
    static int tseat=20;
   /*  synchronized*/static synchronized void book(int bseat){// If we use synchronized keyword then at a time one object can use this resource
     /*  synchronized(this){*/// this perform faster because it synchronizing the block only
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
class Mythread1 extends Thread{
  Bookseats b;
  int bSeat;
  Mythread1(Bookseats b,int bseat){
 this.bSeat=bseat;
 this.b=b;
  }
  public void run(){
   b.book(bSeat);
  }
}
class Mythread2 extends Thread{
  Bookseats b;
  int bSeat;
  Mythread2(Bookseats b,int bseat){
 this.bSeat=bseat;
 this.b=b;
  }
  public void run(){
   b.book(bSeat);
  }
}
class Mythread3 extends Thread{
  Bookseats b;
  int bSeat;
  Mythread3(Bookseats b,int bseat){
 this.bSeat=bseat;
 this.b=b;
  }
  public void run(){
   b.book(bSeat);
  }
}
