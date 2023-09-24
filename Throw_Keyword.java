package OOPS;

import java.util.Scanner;

/*
 Throw keyword used to create user defined Exception
 it create a object for the exception and send it to the jvm for further process
 throw syntex -->
 you have to create a class for exception that extends runtimeexception
 after that at the risky you have to declair the throw keyword
 throw new ExceptionClassName("Your message")
 */
public class Throw_Keyword {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your age :- ");
        int age = sc.nextInt();
            try {
            if(age<18){  
            throw new EligibleException("you are not eligible for vote");// we can not provide any information after throw keyword.
        }
        else{
            System.out.println("you can vote");
        }
    }
    catch(EligibleException e){
        e.printStackTrace();
    }
    }
    
}
class EligibleException extends RuntimeException{
    EligibleException(String msg){
        super(msg);
    }
}
