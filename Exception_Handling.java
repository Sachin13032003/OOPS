package OOPS;

import java.io.FileInputStream;

/* Exception is the unwanted event that destroy thr program normal flow
   Exception Handling is a alternative way to solve the exception problem
   object-->Throwable-->  Exception,Error
   Exception are two types --> checked exception(compile time exception), unchecked exception(run time exception)
   All the exception are occured at the run time
   Error occur due to the lack of System Resources 
   By using this keyword we can solve the exception
   (try,catch,finally,throw,throws)
   try catch syntex -->
   try{
    risky code
   }
   catch(ExceptionClassName referenceVariableName)
   {
     it is  not compulsory to  declare catch if try is declared
    handling code
   }
 */
public class Exception_Handling {
    public static void main(String[] args) {
       /* int a=100,b=0,c;
        //int a=100,b=2,c; // If no exception are there then only try will execute
        c=a/b;
        System.out.println(c);
        try {
            c=a/b;
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
            e.printStackTrace();// it will print the whole object description which is created by the main method for the exception
            System.out.println(e.getmessage())// // it will print only the message
        } */
        try {
            FileInputStream f= new FileInputStream("abc.txt");
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    
}
