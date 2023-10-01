package OOPS;

import java.util.Scanner;

public class Timer extends Thread{
    public void run(){
        try{
        System.out.println("Enter the time in minute you want to set:-");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 00; i<t; i++) {
            for (int j = 0; j<60; j++) {
                Thread.sleep(1000);
                System.out.println(i+":"+j);
         }
     }
     System.out.println("Times up");
            
    }
    catch(Exception e){
        e.printStackTrace();
    }
    }
    public static void main(String[] args) {
        Timer t1 =new Timer();
        t1.start();
    }
}
