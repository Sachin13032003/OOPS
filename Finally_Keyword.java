package OOPS;
/* 
  finally is a block and it is used to clean up the code or close the programs
  finally used after try ,it can not be used as a single
  only try and finally is also can be used
  every programme execute finally block ,there are some cases in that the finally block is not run
 */
public class Finally_Keyword {
    public static void main(String[] args) {
        int a=100,b=0,c;
        //int a=100,b=2,c; // If no exception are there then only try and finally  will execute
        try {
        c=a/b;
        System.out.println(c);
        } 
        catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
           //e.printStackTrace();// it will print the whole object description which is created by the main method for the exception
            // // it will print only the message
        } 
        finally{
            System.out.println("i am in final block");
        }
        
    }
    
}
